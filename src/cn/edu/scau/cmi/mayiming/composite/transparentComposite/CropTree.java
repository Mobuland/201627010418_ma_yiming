package cn.edu.scau.cmi.mayiming.composite.transparentComposite;

import java.util.List;

public class CropTree {
	
	public static Branch compositeCorpTree(){
		//首先产生总经理CEO
		Branch root = new Branch("王小麻子", "总经理", 100000);
		//把三个部门经理产生出来 
		Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
		Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
		Branch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);
		//再把三个小组长产生出来 
		Branch firstDevGroup = new Branch("杨三也斜","开发一组组长",5000);
		Branch secondDevGroup = new Branch("吴大植株","开发二组组长",6000);
		//把所有的小兵都产生出来 
		Leaf a = new Leaf("a","开发人员",2000);
		Leaf b = new Leaf("b","开发人员",2000);
		Leaf c = new Leaf("c","开发人员",2000);
		Leaf d = new Leaf("d","开发人员",2000);
		Leaf e = new Leaf("e","开发人员",2000);
		Leaf f = new Leaf("f","开发人员",2000);
		Leaf g = new Leaf("g","开发人员",2000);
		Leaf h = new Leaf("h", "销售人员", 5000);
		Leaf i = new Leaf("i", "销售人员", 4000);
		Leaf j = new Leaf("j", "财务人员", 5000);
		Leaf k = new Leaf("k", "CEO秘书", 8000);
		Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副经理", 20000);
		//开始组装
		//CEO下有三个部门经理和一个秘书
		root.add(developDep);
		root.add(salesDep);
		root.add(financeDep);
		root.add(k);
		//研发部经理
		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);
		developDep.add(zhengLaoLiu);
		//看看两个开发小组下有什么
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		secondDevGroup.add(d);
		secondDevGroup.add(e);
		secondDevGroup.add(f);
		//再看销售部下的人员情况
		salesDep.add(h);
		salesDep.add(i);
		//最后一个财务
		financeDep.add(j);
		return root;
	}
	
	//遍历整棵树，只要给我根节点，我就能遍历出所有的节点
	public static String getTreeInfo(Branch root){
		return getTreeInfo(root, 0);
	}
	
	public static String getTreeInfo(Branch root, int indent){
		String info = "";
		
		// 当前节点信息
		for (int i = 0; i < indent-1; i++) {
			if (i % 4 == 0) {
				info += "|";
			} else {
				info += " ";
			}
		}
		info += "+";
		info += root.getInfo() + "\n";
		
		// 子节点信息
		List<ICorp> subordinateList = root.getChildren();
		if (subordinateList == null) {
			return "";
		}
		
		for(ICorp s : subordinateList){
			if(s instanceof Leaf){
				// 打印缩进
				for(int i = 0; i < indent+4-1; i++) {
					if (i % 4 == 0) {
						info += "|";
					} else {
						info += " ";
					}
				}
				info += "-";
				info = info + s.getInfo() + "\n";
			}else{	//是个小头目
				// 打印缩进
				for(int i = 0; i < indent+4-1; i++) {
					if (i % 4 == 0) {
						info += "|";
					} else {
						info += " ";
					}
				}
				info += "+";
				info = info + s.getInfo() + "\n" + getTreeInfo((Branch)s, indent+4+4);
			}
		}
		return info;
	}
}
