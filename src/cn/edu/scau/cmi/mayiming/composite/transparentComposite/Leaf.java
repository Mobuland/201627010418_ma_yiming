package cn.edu.scau.cmi.mayiming.composite.transparentComposite;

import java.util.List;

public class Leaf implements ICorp{
	//叶子叫什么名字
	private String name = "";
	//叶子的职位
	private String position = "";
	//叶子的薪水
	private int salary = 0;
	
	//通过构造函数传递信息
	public Leaf(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	//最小的小兵只能获得自己的信息了
	public String getInfo() {
		String info = "";
		info = "名称:"+this.name;
		info = info + "\t职位:"+this.position;
		info = info + "\t薪水:"+this.salary;
		return info;
	}

	@Override
	public void add(ICorp c) {
		// do nothing
	}

	@Override
	public void remove(ICorp c) {
		// do nothing
	}

	@Override
	public ICorp getChild(int i) {
		return null;
	}

	@Override
	public List getChildren() {
		return null;
	}
}
