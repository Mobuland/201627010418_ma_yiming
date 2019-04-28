package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory;

import cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo.PICCCarSpolied;
import cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo.PICCDriverInjuried;
import cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo.PICCMultiAccidents;
import cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo.PICCPeopleDead;

public class PICCInsuranceCliams implements InsuranceClaimsInterface {

	@Override
	public String getInsuranceInfo(int type) {
		switch (type) {
		case 1: // 驾驶员身体受伤
			return new PICCDriverInjuried().getInfo();
		case 2: // 汽车损坏
			return new PICCCarSpolied().getInfo();
		case 3: // 人员伤亡
			return new PICCPeopleDead().getInfo();
		case 4: // 多种事故
			return new PICCMultiAccidents().getInfo();
		default:
			return null;
		}
	}

}
