package com.pangpang;

import com.pangpang.starter.StartupRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class OnconditionApplication {

	@Autowired
	private Hello hello;

	@Bean
	public StartupRunner startupRunner(){
		return new StartupRunner();
	}

	@RequestMapping("/index")
	public String hello(){
		return hello.sayHello();
	}

	/**
	 * 扫描spring-factories文件中ApplicationListener的数量
	 * @return
	 */
	@RequestMapping("/spring-factories")
	public int count(){
		List<ApplicationListener> loadFactories = SpringFactoriesLoader.loadFactories(ApplicationListener.class, null);
		System.out.println(loadFactories.size());
		return loadFactories.size();
	}

	public static void main(String[] args) {
		SpringApplication.run(OnconditionApplication.class, args);
	}
}
