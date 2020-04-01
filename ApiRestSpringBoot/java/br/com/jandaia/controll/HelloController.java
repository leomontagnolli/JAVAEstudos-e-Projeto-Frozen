package br.com.jandaia.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/login")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

}
