package cn.edu.scau.cmi.mayiming.Adapter.classAdapter;

public class AdvancedMediaPlayerImpl implements AdvancedMediaPlayer {

	@Override
	public String playVlc(String fileName) {
		//System.out.println("Playing vlc file. Name: " + fileName);
		return "播放vlc文件: " + fileName;
	}

	@Override
	public String playMp4(String fileName) {
		// TODO Auto-generated method stub
		return "播放MP4文件: " + fileName;
	}

}
