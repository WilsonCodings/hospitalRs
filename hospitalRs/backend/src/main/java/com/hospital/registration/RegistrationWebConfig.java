package com.hospital.registration;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * RegistrationWebConfig.
 * 
 * @author
 *
 */
@Configuration
public class RegistrationWebConfig extends WebMvcConfigurationSupport {

    /**
     * jacksonObjectMapper.
     * 
     * @return ObjectMapper
     */
    @Bean
    @Primary
    public ObjectMapper jacksonObjectMapper() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder().indentOutput(true)
                .dateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return builder.build();
    }

    /**
     * corsFilter.
     * 
     * @return
     */
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin(CorsConfiguration.ALL);
        config.addAllowedHeader(CorsConfiguration.ALL);
        config.addAllowedMethod(CorsConfiguration.ALL);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }

    // @Bean
    // public SecurityInterceptor securityInterceptor() {
    // return new SecurityInterceptor();
    // }
    //
    // @Override
    // public void addInterceptors(InterceptorRegistry registry) {
    // registry.addInterceptor(securityInterceptor()).addPathPatterns("/**").excludePathPatterns("/v1/login",
    // "/**/**/swagger-resources/**", "/**/**/swagger-ui.html/**", "/**/**/webjars/**");
    // }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
