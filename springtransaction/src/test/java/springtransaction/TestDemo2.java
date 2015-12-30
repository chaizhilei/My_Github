package springtransaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.demo2.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring2.xml")
public class TestDemo2 {
	@Resource(name = "accountService")
	private AccountService accountService;

	@Test
	public void demo1() {
		backAccount();
//		accountService.transfer("aaa", "bbb", 200d);
	}
	
	public void backAccount(){
		try {
			accountService.transfer("aaa", "bbb", 200d);
			accountService.transfer("aaa", "ccc", 200d);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=1/0;
	
	}

}
