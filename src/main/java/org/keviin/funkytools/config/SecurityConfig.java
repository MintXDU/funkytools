package org.keviin.funkytools.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        // 未登录用户可以访问的路径
                        .requestMatchers("/", "/login", "/logo.svg").permitAll()
                        // 其他路径需要登录
                        .anyRequest().authenticated()
                        )
                .oauth2Login(oauth2 -> oauth2
                        // 自定义登录页面
                        .loginPage("/login")
                        // 登录成功后跳转到首页
                        .defaultSuccessUrl("/", true)
                )
                .logout(logout -> logout
                        // 退出登录后跳转到首页
                        .logoutSuccessUrl("/")
                        .permitAll()
                );
        return http.build();
    }
}
