package springtransaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo4.IHelloWordService;

public class TestDemo6 {

	@Test
	public void testAop() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring5.xml");

		IHelloWordService helloworldService = ctx.getBean("helloWorldService", IHelloWordService.class);
		helloworldService.sayHello();
	}

}
