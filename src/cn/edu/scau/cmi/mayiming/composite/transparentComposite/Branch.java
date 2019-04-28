package cn.edu.scau.cmi.mayiming.composite.transparentComposite;

import java.util.ArrayList;
import java.util.List;

public class Branch implements ICorp{
	//存储子节点的信息
	private ArrayList<ICorp> subordinateList = new ArrayList<>();
	//树枝节点的名称
	private String name = "";
	//树枝节点的职位
	private String position = "";
	//树枝节点的薪水
	private int salary = 0;
	
	//通过构造函数传递树枝节点的参数
	public Branch(String name, String position,int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//增加一个下属，可能 是小头目，也可能是个小兵
	public void add(ICorp corp) {
		this.subordinateList.add(corp);
	}
	
	public void remove (ICorp corp) {
		this.subordinateList.remove(corp);
	}
	
	public ICorp getChild(int i) {
		return this.subordinateList.get(i);
	}
	
	//得到自己的信息
	public String getInfo() {
		String info = "";
		info = "名称:"+this.name;
		info = info + "\t职位:"+this.position;
		info = info + "\t薪水:"+this.salary;
		return info;
	}
	
	@Override
	public List getChildren() {
		return subordinateList;
	}
}
