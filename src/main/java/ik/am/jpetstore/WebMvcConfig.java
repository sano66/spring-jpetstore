package ik.am.jpetstore;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ImportResource("classpath:/META-INF/spring/spring-mvc.xml")
public class WebMvcConfig extends WebMvcConfigurerAdapter {

}
