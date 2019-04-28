package cn.edu.scau.cmi.mayiming.Adapter.objectAdapter;



public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;
	
	@Override
	public String play(String audioType, String fileName) {

		// 播放 mp3 音乐文件的内置支持
		if (audioType.equalsIgnoreCase("mp3")) {
			// System.out.println("Playing mp3 file. Name: " + fileName);
			return new Mp3Player().play(audioType, fileName);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			// mediaAdapter 提供了播放其他文件格式的支持
			mediaAdapter = new MediaAdapter(new AdvancedMediaPlayerImpl());
			return mediaAdapter.play(audioType, fileName);
		} else {
			// System.out.println("Invalid media. " + audioType + " format not supported");
			return "无效的" + audioType + " 类型不支持";
		}
	}
}
