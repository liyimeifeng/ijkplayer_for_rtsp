package com.dfsx.liuwb.myvideoplay;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.dfsx.videoijkplayer.VideoPlayView;

public class MainActivity extends AbsVideoScreenSwitchActivity {

    private FrameLayout videoContainer;

    private EditText editVideoUrl;
    private String url = "rtsp://192.168.2.67:8554/MainStream";
//    private String url = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f30.mp4";   //测试可行
//    private String url = "rtsp://192.168.6.77:8554/730446.sdp";       //测试可行
    private Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoContainer = (FrameLayout) findViewById(R.id.video_view_container);
        editVideoUrl = (EditText) findViewById(R.id.edit_video_url);
        btnPlay = (Button) findViewById(R.id.btn_start);
        editVideoUrl.setText(url);
//        editVideoUrl.setText("rtsp://rtsp-v3-spbtv.msk.spbtv.com/spbtv_v3_1/214_110.sdp");
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editVideoUrl.getText().toString();
                if (!TextUtils.isEmpty(url)) {
                    videoPlayer.start(url);
                }
            }
        });
    }

    @Override
    public void addVideoPlayerToContainer(VideoPlayView videoPlayer) {
        if (videoPlayer != null) {
            videoContainer.addView(videoPlayer, 0);
        }
    }
}
