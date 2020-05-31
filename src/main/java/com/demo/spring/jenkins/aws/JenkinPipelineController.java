package com.demo.spring.jenkins.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JenkinPipelineController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Jenins AWS Pipeline !!!!";
	}

}
