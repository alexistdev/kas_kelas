package com.kas_kelas.kas_kelas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedMethods(
                        HttpMethod.POST.name(), HttpMethod.GET.name(), HttpMethod.DELETE.name(),
                        HttpMethod.PUT.name(), HttpMethod.PATCH.name());
//				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods(
//						HttpMethod.POST.name(), HttpMethod.GET.name(), HttpMethod.DELETE.name(),
//						HttpMethod.PUT.name(), HttpMethod.PATCH.name());

            }
        };
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((authorizeRequests) ->
                        authorizeRequests.requestMatchers("/v1/api/**")
                                .permitAll()
                                .anyRequest()
                                .authenticated()
                );
        return http.build();
    }
}
