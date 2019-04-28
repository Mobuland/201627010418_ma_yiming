package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo;

public class PICCDriverInjuried implements InsuranceInfoInterface {

	@Override
	public String getInfo() {
		return "PICC Insurance info: 这是一个身体受伤类型.";
	}

}
