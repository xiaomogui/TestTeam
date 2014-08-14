/**
 * 
 * @creatTime 下午3:38:57
 * @author XuYi
 */
package com.sain.testteam.jmxmbean;

import java.util.Random;

/**
 * @author XuYi
 * 
 */
public class Echo implements EchoMBean {

	private String str = "789";

	@Override
	public String print(String str) {
		return str;

	}

	@Override
	public double hehe() {
		return new Random().nextDouble();
	}

	/**
	 * 属性str的get方法(所以不会注册为MBean方法)
	 */
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return this.str;
	}

	@Override
	public String printStr() {
		// TODO Auto-generated method stub
		return this.str;
	}

}
