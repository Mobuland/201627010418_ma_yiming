package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo;

public class PingAnMultiAccidents implements InsuranceInfoInterface {

	@Override
	public String getInfo() {
		return "PingAn Insurance info: 这是多种事故类型";
	}

}
