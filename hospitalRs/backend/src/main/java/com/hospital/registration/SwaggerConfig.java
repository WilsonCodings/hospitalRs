package com.hospital.registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * Config Swagger.
     * 
     * @return
     */
    @Bean
    public Docket groundApplicationDoc() {
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        parameterBuilder.name("Authorization").description("Bearer <token>").modelRef(new ModelRef("string"))
                .parameterType("header").required(false).build();
        List<Parameter> parameters = new ArrayList<Parameter>();
        parameters.add(parameterBuilder.build());

        return new Docket(DocumentationType.SWAGGER_2).groupName("registration").select()
                .apis(RequestHandlerSelectors.any()).paths(Predicates.not(PathSelectors.regex("/error"))).build()
                .globalOperationParameters(parameters).apiInfo(apiInfo()).enable(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Registration APIs").description("Registration APIs").version("1.0").build();
    }
}
