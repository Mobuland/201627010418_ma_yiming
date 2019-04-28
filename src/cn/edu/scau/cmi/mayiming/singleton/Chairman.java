package cn.edu.scau.cmi.mayiming.singleton;

public class Chairman {

	private static Chairman chairman;
	private String name;

	private Chairman(String name) {
		this.name=name;
	}

	public static Chairman getInstance(String name) {
//		Chairman chairman = null;
		if (chairman == null) {
			chairman=new Chairman(name);
			return chairman;
		} else
			return chairman;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void excuteOfDuty(){
		System.out.println("同志们辛苦了");
	}
	
}
