package com.zmd.elm;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 负责实现跨域访问，全局定义。
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		registry.addMapping("/**")
		.allowedOrigins("*")
		.allowCredentials(true)
		.allowedMethods("*")
		.allowedHeaders("*")
		.maxAge(36000);
	}
}