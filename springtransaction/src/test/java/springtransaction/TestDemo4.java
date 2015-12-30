package springtransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo2.AccountDaoImpl;

public class TestDemo4 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		AccountDaoImpl accountDao = (AccountDaoImpl) context.getBean("accountDao");
		AccountDaoImpl accountDao1 = (AccountDaoImpl) context.getBean("accountDao");
		System.out.println(accountDao==accountDao1);
	}

}
