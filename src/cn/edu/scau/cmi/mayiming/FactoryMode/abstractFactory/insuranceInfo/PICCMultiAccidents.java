package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo;

public class PICCMultiAccidents implements InsuranceInfoInterface {

	@Override
	public String getInfo() {
		return "PICC Insurance info: 这是多种事故类型.";
	}

}
