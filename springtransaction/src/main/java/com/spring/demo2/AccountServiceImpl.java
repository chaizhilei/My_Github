package com.spring.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.spring.event.AccountEvent;
import com.spring.event.CoreEventDispatcher;

/**
 * 转账案例的实现类
 * @author: chaizhilei
 * @date: 2015年9月8日 下午3:34:58
 */
/**
 * @Transaction 注解中的属性 propagation：事务的传播行为 isolation :事务的隔离级别 readOnly :只读
 *              rollbackFor:发生哪些异常回滚 noRollbackFor:发生哪些异常不回滚
 * 
 * @author: chaizhilei
 * @date: 2015年9月8日 下午3:35:12
 */
// @Transactional(propagation=Propagation.REQUIRED)//也可以放在类上
public class AccountServiceImpl implements AccountService {

	private Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	private CoreEventDispatcher coreEventDispatcher;

	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setCoreEventDispatcher(CoreEventDispatcher coreEventDispatcher) {
		this.coreEventDispatcher = coreEventDispatcher;
	}



	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	// 也可以放在类上
	public void transfer(String out, String in, Double money) throws Exception {
		try {
			accountDao.outMoney(out, money);
			coreEventDispatcher.publish(new AccountEvent(out));
			accountDao.inMoney(in, money);
			coreEventDispatcher.publish(new AccountEvent(in));
		} catch (Exception e) {
			log.error("出错了",e);
			throw e;
		}
		
	}

}
