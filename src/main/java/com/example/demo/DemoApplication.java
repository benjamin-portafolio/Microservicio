package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import VO.PeticionVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class DemoApplication {
	
	
	
	@GetMapping("/weatherForecast")
	public String getMessage () {
		return "Today is a great sunny day for Java service probando";
	}
	
	
	@PostMapping("/testPost")
	String testPost(@RequestBody PeticionVO objeto) {
		Lista lista=new Lista();
		return "retorno obtenido desde post: " + objeto.getObjLista();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
