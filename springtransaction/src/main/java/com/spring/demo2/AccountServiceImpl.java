package com.spring.demo2;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 * 转账案例的实现类
 * @author: chaizhilei
 * @date: 2015年9月8日 下午3:34:58
 */
/**
 * @Transaction 注解中的属性
 *   propagation：事务的传播行为
 *   isolation  :事务的隔离级别
 *   readOnly   :只读
 *   rollbackFor:发生哪些异常回滚
 *   noRollbackFor:发生哪些异常不回滚
 *   
 * @author: chaizhilei
 * @date: 2015年9月8日 下午3:35:12
 */
//@Transactional(propagation=Propagation.REQUIRED)//也可以放在类上
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)//也可以放在类上
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		int i = 1/0;
		accountDao.inMoney(in, money);
	}

}
