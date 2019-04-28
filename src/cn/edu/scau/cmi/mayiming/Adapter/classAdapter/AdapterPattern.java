package cn.edu.scau.cmi.mayiming.Adapter.classAdapter;

public class AdapterPattern {

	AudioPlayer audioPlayer = new AudioPlayer();
	
	public  String getMediaPlayingInfo(int type) {
		switch (type) {
		case 1:
			return audioPlayer.play("mp3", "邓紫棋.mp3");
		case 2:
			return audioPlayer.play("mp4", "Kb.mp4");
		case 3: // 人员伤亡
			return audioPlayer.play("vlc", "many.vlc");
		case 4: // 多种事故
			return audioPlayer.play("avi", "go.avi");
		default:
			return null;
		}
	}

}
