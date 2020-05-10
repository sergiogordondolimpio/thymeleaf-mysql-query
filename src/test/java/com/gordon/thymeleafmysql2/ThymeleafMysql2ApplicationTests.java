package com.gordon.thymeleafmysql2;

import com.gordon.thymeleafmysqlquery.model.User;
import com.gordon.thymeleafmysqlquery.service.ChildrenService;
import com.gordon.thymeleafmysqlquery.service.MonthspayService;
import com.gordon.thymeleafmysqlquery.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

import java.util.Optional;

@SpringBootTest
class ThymeleafMysql2ApplicationTests {

	@Autowired
	private UserService userService;
	@Autowired
	private ChildrenService childrenService;
	@Autowired
	private MonthspayService monthspayService;

	@Before
	public void initDb(){
		{
			User user = new User(1,"cata", "fran", "123456", 1234567, "cata@email.com");
			userService.createUser(user);
		}
		{
			User user = new User(2,"cata", "fran", "123456", 1234567, "fran@email.com");
			userService.createUser(user);
		}
	}

	@Test
	public void testUser(){
		Optional<User> user = userService.findOne(1);
		assertNotNull(user);
		Optional<User> admin = userService.findOne(2);
		assertEquals(admin.get(), "fran@email.com");
	}

}
