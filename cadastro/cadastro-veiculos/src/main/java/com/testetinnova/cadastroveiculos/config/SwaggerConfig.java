package com.testetinnova.cadastroveiculos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.testetinnova.cadastroveiculos.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}

	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("API - Modificar lista de veículos")
				.description("Projeto de API para realizar alterações básicas em uma lista de veículos - Tinnova.")
				.version("1.0.0").license("Apache License Version 2.0")
				.contact(contact())
				.build();
	}

	private Contact contact() {
		return new Contact("Mathias Niashi", "https://github.com/Niashi", "mathias.pn7@gmail.com");
	}

}
	
	
		
//		@Bean
//		public Docket api() {
//			return new Docket(DocumentationType.SWAGGER_2).select()
//					.apis(RequestHandlerSelectors.basePackage("com.testetinnova.cadastroveiculos.controller"))
//					.paths(PathSelectors.any()).build().apiInfo(metadata());
//		}
//		
//		
//		public static ApiInfo metadata() {
//			return new ApiInfoBuilder().title("API - Modificar lista de veículos").description("Projeto de API para realizar alterações básicas em uma lista de veículos - Tinnova.")
//					.version("1.0.0").license("Apache License Version 2.0").licenseUrl("https://banco-de-veiculos.herokuapp.com/swagger-ui/")
//					.contact(contact()).build();
//		}
//		
//		private static Contact contact() {
//			return new Contact("Mathias Niashi", "https://github.com/Niashi", "mathias.pn7@gmail.com");
//		}