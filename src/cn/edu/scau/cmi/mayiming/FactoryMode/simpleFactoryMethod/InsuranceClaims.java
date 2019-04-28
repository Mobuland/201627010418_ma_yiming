package cn.edu.scau.cmi.mayiming.FactoryMode.simpleFactoryMethod;

/**
 * 根据保险理赔的类型返回相应的理赔信息 （简单工厂方法）
 * @author cry
 *
 */
public class InsuranceClaims {
	public static String getInsuranceInfo (int type) {
		switch (type) {
		case 1: // 驾驶员身体受伤
			return "这是一个身体受伤类型";
		case 2: // 汽车损坏
			return "这是一个汽车损坏类型";
		case 3: // 人员伤亡
			return "这是一个人员伤亡类型";
		case 4: // 多种事故
			return "这是多种事故类型";
		default:
			return null;
		}
	}
}
