package cn.edu.scau.cmi.mayiming.Adapter.classAdapter;



public class AudioPlayer implements MediaPlayer {
	private MediaPlayer mediaPlayer = null;
	
	@Override
	public String play(String audioType, String fileName) {
		
		if (audioType.equalsIgnoreCase("mp3")) {
			mediaPlayer = new Mp3Player();
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaPlayer = new MediaAdapter();
		} 
		
		if (mediaPlayer != null) {
			return mediaPlayer.play(audioType, fileName);
		} else {
			return "无效的 " + audioType + " 类型不支持";
		}
	}
}
