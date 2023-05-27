package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testbike {
 public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("ioc1.xml");
	bike b = (bike)context.getBean("bike");
	b.bmw();
}
}
