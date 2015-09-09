package com.spring.demo1;

public interface AccountService {

	/**
	 * 
	 * @author: chaizhilei
	 * @date: 2015年9月8日 上午11:17:52
	 * @param out
	 *            转出账户
	 * @param in
	 *            转入账户
	 * @param money
	 *            转账金额
	 */
	public void transfer(String out, String in, Double money);
}
