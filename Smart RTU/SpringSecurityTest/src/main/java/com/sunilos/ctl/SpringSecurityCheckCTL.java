package com.sunilos.ctl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SpringSecurityCheckCTL {
	
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser() {
		return ResponseEntity.ok("Yes I am Admin User");
		
	}
	@GetMapping("/normal")
	public ResponseEntity<String> normalUser() {
		return ResponseEntity.ok("Yes I am normal User");
		
	}
	
	@GetMapping("/public")
	public ResponseEntity<String> publicUser() {
		return ResponseEntity.ok("Yes I am public User");
		
	}

}
