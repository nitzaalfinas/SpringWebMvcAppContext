package com.nitza.trycontexta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public String tutContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
		
		TutAppContext tutBean = (TutAppContext) context.getBean("tutBean");
		return tutBean.printJsonString();
	}
}
