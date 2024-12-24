package com.datnguyen.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Controller
public class WebappApplication {
	@GetMapping("/")
	public String index(final Model model) {
		model.addAttribute("title", "This is a SpringBoot Static Web Application");
		model.addAttribute("msg", "Application Is Deployed To Kubernetes");
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

}
