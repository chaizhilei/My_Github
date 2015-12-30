package com.spring.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test/account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	
	@RequestMapping(value="/trans")
	@ResponseBody
//	@Transactional(propagation=Propagation.REQUIRED)//也可以放在类上
	public String transferMoney(){
		try {
			accountService.transfer("aaa", "bbb", 200d);
			accountService.transfer("aaa", "ccc", 200d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
