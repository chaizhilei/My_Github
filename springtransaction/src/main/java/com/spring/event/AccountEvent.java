/**
 * gomeo2o.com 
 * Copyright (c) 2015-2025 All Rights Reserved.
 * @Description TODO 
 * @author kl_chaizhilei
 * @date 2015年12月30日 下午3:19:11
 */
package com.spring.event;

/**
 * @Description 账户相关事件
 * @author kl_chaizhilei
 * @date 2015年12月30日 下午3:19:11
 */
public class AccountEvent {

	private String account;

	public AccountEvent() {
	}

	public AccountEvent(String account) {
		super();
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
