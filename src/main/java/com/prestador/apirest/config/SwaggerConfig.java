package com.prestador.apirest.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
    @Bean
    public Docket apiPrestador() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("prestador")
                .apiInfo(metaInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/prestador/.*"))
                .build();
    }

    @Bean
    public Docket apiEspecialidade() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("especialidade")
                .apiInfo(metaInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/especialidade/.*"))
                .build();
    }    

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "API REST Prestador",
                "API REST de cadastro de prestadores.",
                "1.0",
                "Terms of Service",
                new Contact("Felipe Brandão", "",
                        "felipe.b31@gmail.com"),
                "",
                "", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
}