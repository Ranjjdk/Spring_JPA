package com.routesms.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.routesms.jpa.entity.User;
import com.routesms.jpa.service.UserService;

@SpringBootApplication
public class SpringJpaApplication {
	
	
	private static UserService userService;

    /**
     * In setter injection, the @Autowired annotation is commonly 
     * used on the setter method. This annotation tells Spring to 
     * inject the required dependency (UserService in this case) into 
     * the setter method when creating an instance of the class.
     *  If @Autowired is not used, the injection might not occur,
     *   and the setter method could remain unused.
     * 
     * **/
	//setters injection
//	@Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
	
	
	
	/**constructor injection
	 * In constructor injection, the @Autowired annotation 
	 * is often optional. If a class has only one constructor, 
	 * Spring automatically considers it as the constructor to 
	 * use for injection, and @Autowired can be omitted. In other words, 
      for constructor injection, @Autowired is 
      implied if there's only one constructor in the class.
	 * **/
	public SpringJpaApplication(UserService userService) {
		
	     this.userService=userService;	
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
		
		
		User usr=new User("Ranjeer","sdsfv");
		addUser(usr);
		
		
	}
	
	
	public static void addUser(User user) {
		
		userService.addUser(user);
		
	}

}
