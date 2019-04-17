package demo2019_4_12;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yuki.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath*:spring.xml")
public class TestUserService {
	@Autowired
	private UserService service;
	
	@Test
	public void demo1(){
		
		List list = service.listMyUsers("", 0, 3);
		for (Object o : list) {
			System.out.println(o);
			
		}
		System.out.println("************************************************");
	}
	

}
