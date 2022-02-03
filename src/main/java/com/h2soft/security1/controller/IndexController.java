package com.h2soft.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	//mustache 기본 폴더 src/main/resources
	//뷰리졸버 설정 :/templates(prefix) .mustache(suffix) 생략 가능 application.yml
	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
}
