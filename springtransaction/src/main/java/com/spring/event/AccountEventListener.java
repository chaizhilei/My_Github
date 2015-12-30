/**
 * gomeo2o.com 
 * Copyright (c) 2015-2025 All Rights Reserved.
 * @Description TODO 
 * @author kl_chaizhilei
 * @date 2015年12月30日 下午4:40:11
 */
package com.spring.event;

import com.google.common.eventbus.Subscribe;

/**
 * @Description 账户时间监听处理
 * @author kl_chaizhilei
 * @date 2015年12月30日 下午4:40:11
 */
public class AccountEventListener implements EventListener {

	@Subscribe
	public void onAccountEvent(AccountEvent e) {
		System.out.println("操作账户了,账户id为：" + e.getAccount());
	}

}
