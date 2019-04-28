package cn.edu.scau.cmi.mayiming.composite.transparentComposite;

import java.util.List;

interface ICorp {
	
	void add(ICorp c);
	
    void remove(ICorp c);
    
    ICorp getChild(int i);
    
    List getChildren();
    
    String getInfo();
}
