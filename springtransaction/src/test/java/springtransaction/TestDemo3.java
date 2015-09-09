package springtransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring_quartz.xml")
public class TestDemo3 {
	public static void main(String[] args) {
		  System.out.println("Test start.");
	       ApplicationContext context = new ClassPathXmlApplicationContext("spring_quartz.xml");
	       //如果配置文件中将startQuertz bean的lazy-init设置为false 则不用实例化
	       System.out.print("Test end..\n");
	}

}
