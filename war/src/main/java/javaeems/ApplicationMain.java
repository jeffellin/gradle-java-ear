package javaeems;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javaeems.chapter1.model.ModelEJB;
import javaeems.chapter1.web.*;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.*;
@SpringBootApplication
@ServletComponentScan
public class ApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
	}




}