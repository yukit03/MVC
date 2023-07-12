package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")//ブラウザから/helloというリクエストが来た時に呼び出される
public class HelloViewController {
	
	
	@GetMapping("view")
	public String helloView() {
		//戻り値は「ビュー名」返す
		return "hello";
		
	}

}
