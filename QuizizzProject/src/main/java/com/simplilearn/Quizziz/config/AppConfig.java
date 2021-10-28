package com.simplilearn.Quizziz.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class AppConfig {
	private final String URL = "jdbc:mysql://localhost:3306/sportyshoes";
	private final String USER = "root";
	private final String PASSWORD = "1234";
	private final String DRIVER = "com.mysql.jdbc.Driver";


@Bean
DataSource datasource() {
	DriverManagerDataSource dms = new DriverManagerDataSource();
	dms.setUrl(URL);
	dms.setUsername(USER);
	dms.setPassword(PASSWORD);
	dms.setDriverClassName(DRIVER);
	return dms;
	
}

}
