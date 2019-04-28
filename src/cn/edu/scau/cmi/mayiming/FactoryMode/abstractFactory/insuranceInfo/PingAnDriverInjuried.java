package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo;

public class PingAnDriverInjuried implements InsuranceInfoInterface {

	@Override
	public String getInfo() {
		return "PingAn Insurance info: 这是一个身体受伤类型.";
	}

}
