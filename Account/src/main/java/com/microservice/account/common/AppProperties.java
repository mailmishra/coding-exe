/**
 * 
 */
package com.microservice.account.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

/**
 * @author amitmishra
 *
 */
@Configuration
@PropertySource("classpath:acct-service.properties")
public class AppProperties {
	
	@Value("${dateformat.view}")
	private String viewDateFormatStr;
	

	/**
	 * @return the viewDateFormat
	 */
	public String getViewDateFormatStr() {
		return viewDateFormatStr;
	}

	
	@Bean
	public DateFormat viewDateFormat() {
		return new SimpleDateFormat(viewDateFormatStr);
	}
	

}
