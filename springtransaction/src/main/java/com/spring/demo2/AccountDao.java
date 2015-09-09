package com.spring.demo2;

public interface AccountDao {

	/**
	 * 
	 * @author: chaizhilei
	 * @date: 2015年9月8日 上午11:19:29
	 * @param out
	 *            转出账号
	 * @param money转出的钱
	 */
	public void outMoney(String out, Double money);

	/**
	 * 
	 * @author: chaizhilei
	 * @date: 2015年9月8日 上午11:19:34
	 * @param in
	 *            转入账号
	 * @param money
	 *            转入的钱
	 */
	public void inMoney(String in, Double money);

}
