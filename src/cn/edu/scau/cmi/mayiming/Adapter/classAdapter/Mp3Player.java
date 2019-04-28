package cn.edu.scau.cmi.mayiming.Adapter.classAdapter;

public class Mp3Player implements MediaPlayer{

	@Override
	public String play(String audioType, String fileName) {
		if ("mp3".equalsIgnoreCase(audioType)) {
			return "播放mp3文件: " + fileName;
		} else {
			return "没有mp3文件!";
		}
	}

}
