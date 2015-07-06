package springbook.learningtest.spring.ioc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanRoleTest {

	@Test
	public void SimpleConfig(){
		GenericApplicationContext ac = new GenericXmlApplicationContext(BeanRoleTest.class, "beanrole.xml");
		BeanDefinitionUtils.printBeanDefinitions(ac);
		
		SimpleConfig sc = ac.getBean(SimpleConfig.class);
		assertThat(sc.hello, is(notNullValue()));
		sc.hello.sayHello(); // 예외 발생하지 않음.
	}
}
