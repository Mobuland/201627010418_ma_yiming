package cn.edu.scau.cmi.mayiming.FactoryMode.factoryMethod;

public class InsuranceClaims implements InsuranceClaimsInterface {

	@Override
	public String getInsuranceInfo(int type) {
		switch (type) {
		case 1: // 驾驶员身体受伤
			return new DriverInjuried().getInfo();
		case 2: // 汽车损坏
			return new CarSpolied().getInfo();
		case 3: // 人员伤亡
			return new PeopleDead().getInfo();
		case 4: // 多种事故
			return new MultiAccidents().getInfo();
		default:
			return null;
		}
	}

}
