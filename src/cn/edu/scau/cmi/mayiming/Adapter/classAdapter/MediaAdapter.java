package cn.edu.scau.cmi.mayiming.Adapter.classAdapter;

/**
 * 类适配器方式：通过继承实现
 * @author cry
 *
 */
public class MediaAdapter extends AdvancedMediaPlayerImpl implements MediaPlayer {
	
	@Override
	public String play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			return playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			return playMp4(fileName);
		} else {
			return "Sorry! I haven't the function of playing such kind of media.";
		}
	}

	
}
