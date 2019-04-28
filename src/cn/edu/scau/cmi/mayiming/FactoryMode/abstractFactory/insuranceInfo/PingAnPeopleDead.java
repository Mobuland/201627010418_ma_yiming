package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo;

public class PingAnPeopleDead implements InsuranceInfoInterface {

	@Override
	public String getInfo() {
		return "PingAn Insurance info: 这是一个人员伤亡类型.";
	}

}
