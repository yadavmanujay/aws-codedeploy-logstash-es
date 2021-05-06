package com.elk.demo.simplerest;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {

	@GetMapping("/")
	public ResponseEntity<String> sayHello() {
		return ResponseEntity.ok(String.format("Service is up, called at system time %s", Instant.now()));
	}

}