package com.example.userservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurity {
    private static final String[] WHITE_LIST = {
            "/users/**",
            "/**"
    };
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .sessionManagement((sessionManagement) ->
                        sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .authorizeHttpRequests((authorizeRequests) ->
//                        authorizeRequests.anyRequest().permitAll()
//                        authorizeRequests.requestMatchers(WHITE_LIST).permitAll()
                        authorizeRequests
                                .anyRequest().permitAll()
//                                .requestMatchers("/users/**").permitAll()
//                                .requestMatchers(PathRequest.toH2Console()).permitAll()
                )
                .headers(AbstractHttpConfigurer::disable);
        return http.build();
    }
}