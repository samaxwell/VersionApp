package com.sean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("version")
@SpringBootApplication
public class VersionServiceApplication {

	@Value("${app.version}")
	private String version;

	public static void main(String[] args) {
		SpringApplication.run(VersionServiceApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String> getVersion() {
		return ResponseEntity.ok("version ".concat(version));
	}

}
