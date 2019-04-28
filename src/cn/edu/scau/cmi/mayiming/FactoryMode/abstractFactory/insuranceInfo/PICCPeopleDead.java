package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo;

public class PICCPeopleDead implements InsuranceInfoInterface {

	@Override
	public String getInfo() {
		return "PICC Insurance info: 这是一个人员伤亡类型.";
	}

}
