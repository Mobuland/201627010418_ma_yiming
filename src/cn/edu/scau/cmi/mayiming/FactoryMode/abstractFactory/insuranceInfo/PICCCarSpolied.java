package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo;

public class PICCCarSpolied implements InsuranceInfoInterface {

	@Override
	public String getInfo() {
		return "PICC Insurance info: 这是一个汽车损坏类型.";
	}

}
