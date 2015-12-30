package springtransaction;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo5 {

	@Test
	public void testConfig() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring4.xml");
		String hello1 = ctx.getBean("hello1", String.class);
		String hello2 = ctx.getBean("hello2", String.class);
		String hello3 = ctx.getBean("hello3", String.class);
		System.out.println(hello1);
		System.out.println(hello2);
		System.out.println(hello3);
		Assert.assertEquals("Hello World!", hello1);
		Assert.assertEquals("Hello World!", hello2);
		Assert.assertEquals("Hello World!", hello3);
	}
}
