package com.e_commerce.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity
@ComponentScan
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private LoginFail loginFail;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requiresChannel().anyRequest().requiresSecure()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/", "/public/**").permitAll()
                .antMatchers(HttpMethod.GET, "/account/current").permitAll()
//                .antMatchers("/profile/**").permitAll()
                .antMatchers("/register**").permitAll()
                .antMatchers("/login/**", "/login**", "/logout").permitAll()
//                .antMatchers("/request/new/**", "/credit/all").permitAll()
//                .antMatchers("/users/**").hasAuthority("ROLE_ADMIN")
                .anyRequest().fullyAuthenticated()
                .and()
                .formLogin().loginPage("/login").failureUrl("/#/login?error").failureHandler(loginFail)
                .usernameParameter("email").passwordParameter("password")
                .defaultSuccessUrl("/").permitAll()
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/").permitAll()
                .and().csrf().disable();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
}
