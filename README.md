* **IjkPlayer_demo<http://blog.csdn.net/huaxun66/article/details/53401231>完整的项目工程，支持rtsp、rtmp、MP4播放，但是可能会出现一定几率的播放rtsp黑屏状况（AUTO:原地址上的demo不能支持rtsp以及MP4等格式视频，需要用下面第二条中的动态链接库做相应替换）**

* **MyIJKDemo参考的上面的工程进行修改，目前已经更新so文件，支持多种格式的视频播放**

* **jniLibs/armeabi-v7a是编译好的ijk动态链接库，(<http://download.csdn.net/detail/hebeixmg/9604675#comment>)，不支持MP4，支持rtsp，但是可能会有三到五秒左右的延迟。可以直接到入项目使用，导入方法参考上面的两个项目**

* **jniLibs是编译好的支持rtsp、MP4、avi、rmvb、mkv等格式视频的so文件**

* **rtsp-player-master是一个无延迟效果的支持rtsp的demo，  
   based on**<https://github.com/bowen919446264/rtsp_player>
   

