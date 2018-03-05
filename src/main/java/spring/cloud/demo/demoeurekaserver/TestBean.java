package spring.cloud.demo.demoeurekaserver;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean 
{
	@Value("${some.dependent.property}")
	private String testProp;
	
	@PostConstruct
	public void initTest()
	{
		System.out.println("----------------------------------------------------");
		System.out.println(testProp);
		System.out.println("----------------------------------------------------");
	}
}
