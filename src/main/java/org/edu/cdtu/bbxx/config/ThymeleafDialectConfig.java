package org.edu.cdtu.bbxx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.edu.cdtu.bbxx.config.thymeleaf.dialect.ThSysDialect;

/**
 * Thymeleaf配置
 *
 * @author : 宋浩志
 * @createDate : 2018年12月4日
 *
 */
@Configuration
public class ThymeleafDialectConfig {
	@Bean
	public ThSysDialect thSysDialect() {
		return new ThSysDialect();
	}
}
