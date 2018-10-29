package com.common.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class CommonAdminApplication extends WebMvcConfigurerAdapter{
//
//	public static void main(String[] args) {
//		SpringApplication.run(CommonAdminApplication.class, args);
//	}
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
//		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//		super.addResourceHandlers(registry);
//	}
//}

@SpringBootApplication
public class CommonAdminApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CommonAdminApplication.class, args);
	}

}