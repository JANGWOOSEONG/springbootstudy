package com.gdu.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {
	// 뷰 리졸버가 없기 때문에  prefix /// suffix 안해준다.
	// 타임리프 이용
	@GetMapping("/")
	public String welcome() {
		return "index"; // src/main/resources/templates/index.html
	}

}
