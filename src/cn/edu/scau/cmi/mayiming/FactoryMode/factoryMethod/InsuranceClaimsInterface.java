package cn.edu.scau.cmi.mayiming.FactoryMode.factoryMethod;

/**
 * 根据保险理赔的类型返回相应的理赔信息 （工厂方法）
 * @author cry
 *
 */
public interface InsuranceClaimsInterface {
	String getInsuranceInfo (int type);
}
