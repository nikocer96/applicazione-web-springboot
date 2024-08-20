package com.in28minutes.springboot.myfirstwebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello web app";
	}
	
	// SE INSERISCO RESPONSEBODY MI RESTITUISCE DIRETTAMENTE QUELLO CHE C'E' NEL RETURN
	// E PER REINDIRIZZARE AD UN'ALTRA PAGINA NON VA BENE
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
