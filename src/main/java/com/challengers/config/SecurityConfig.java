package com.challengers.config;

import com.challengers.UserControllerMethods;
import com.challengers.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Malika(mxp134930) on 12/13/2015.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserLoginService userLoginService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/","/showregisterform", "/webjars/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
//        auth.userDetailsService(userLoginService).passwordEncoder(md5PasswordEncoder);
        auth.userDetailsService(userLoginService);
/*
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("admin").roles("USER");
*/
    }

}
