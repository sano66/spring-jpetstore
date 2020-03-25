package ik.am.jpetstore;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@ImportResource("classpath:/META-INF/spring/spring-security.xml")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

}
