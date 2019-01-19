package com.apisoccer.configuration;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.apisoccer")
public class ApiSoccerConfiguration {

    @Bean(destroyMethod = "close")
    DataSource dataSource(Environment env) {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass("com.mysql.jdbc.Driver");
        } catch (IllegalStateException | PropertyVetoException ex) {
            throw new RuntimeException("error while setting the driver class name in the datasource", ex);
        }
        ds.setJdbcUrl(("jdbc:mysql://localhost:3306/fifa?autoReconnect=true&useSSL=false&rewriteBatchedStatements=true"));
        ds.setUser(("root"));
        ds.setPassword(("root"));
        ds.setAcquireIncrement(5);
        ds.setMinPoolSize(5);
        ds.setMaxPoolSize(100);
        ds.setMaxIdleTime(1200);
        ds.setUnreturnedConnectionTimeout(120);
 
        return ds;
    }
     
    @Bean
    JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);        
    }
     
    @Bean
    DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    } 	
	
}
