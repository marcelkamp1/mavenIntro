package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul><li><a href='/doctor/1'>Doctor 1</a></li>"
				+ "<li><a href='/doctor/7'>Doctor 7</a></li>"
				+ "<li><a href='/doctor/10'>Doctor 10</a></li>"
				+ "<li><a href='/doctor/13'>Doctor 13</a></li></ul>";
	}
	
	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doc1() {
		return "William Hartnell";
	}
	
	@RequestMapping("/doctor/7")
	@ResponseBody
	public String doc7() {
		return "Sylvester McCoy";
	}
	
	@RequestMapping("/doctor/10")
	@ResponseBody
	public String doc10() {
		return "David Tennant";
	}
	
	@RequestMapping("/doctor/13")
	@ResponseBody
	public String doc13() {
		return "Jodie Whittaker";
	}
}
