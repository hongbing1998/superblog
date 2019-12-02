package org.edu.cdtu.bbxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author songhaozhi
 *
 */
@SpringBootApplication
@MapperScan("org.edu.cdtu.bbxx.mapper")
@EnableTransactionManagement
@EnableCaching
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
