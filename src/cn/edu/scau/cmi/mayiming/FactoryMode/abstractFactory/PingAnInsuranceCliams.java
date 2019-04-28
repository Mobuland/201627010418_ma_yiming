package cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory;

import cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo.PingAnCarSpolied;
import cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo.PingAnDriverInjuried;
import cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo.PingAnMultiAccidents;
import cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.insuranceInfo.PingAnPeopleDead;

public class PingAnInsuranceCliams implements InsuranceClaimsInterface {

	@Override
	public String getInsuranceInfo(int type) {
		switch (type) {
		case 1: // 驾驶员身体受伤
			return new PingAnDriverInjuried().getInfo();
		case 2: // 汽车损坏
			return new PingAnCarSpolied().getInfo();
		case 3: // 人员伤亡
			return new PingAnPeopleDead().getInfo();
		case 4: // 多种事故
			return new PingAnMultiAccidents().getInfo();
		default:
			return null;
		}
	}

}
