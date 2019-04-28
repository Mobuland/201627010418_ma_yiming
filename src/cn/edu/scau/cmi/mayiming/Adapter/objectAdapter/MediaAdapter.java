package cn.edu.scau.cmi.mayiming.Adapter.objectAdapter;

/**
 * 对象适配器方式：通过关联实现
 * @author cry
 *
 */
public class MediaAdapter implements MediaPlayer {
	
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter (AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}
	
	@Override
	public String play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			return advancedMediaPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			return advancedMediaPlayer.playMp4(fileName);
		} else {
			return "Sorry! I haven't the function of playing such kind of media.";
		}
	}

	
}
