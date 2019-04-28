package cn.edu.scau.cmi.mayiming.composite.safeComposite;

import java.util.ArrayList;

public interface IBranch extends ICorp{
	
	//能够增加小兵（树叶节点）或者是经理（树枝节点）—— 不管传什么都是向上造型
	void addSubordinate(ICorp corp);
	
	//我还要能够获得下属的信息
	ArrayList<ICorp> getSubordinate();
	
}
