package kr.or.chan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"kr.or.chan.dao", "kr.or.chan.service"})
@Import({DBConfig.class})
public class ApplicationConfig {

}
