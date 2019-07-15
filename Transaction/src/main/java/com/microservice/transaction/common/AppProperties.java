/**
 * 
 */
package com.microservice.transaction.common;

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
@PropertySource("classpath:tran-service.properties")
public class AppProperties {
	
	@Value("${dateformat.view}")
	private String viewDateFormatStr;
	
	@Value("${dateformat.iso}")
	private String isoDateFormatStr;

	/**
	 * @return the isoDateFormatStr
	 */
	public String getIsoDateFormatStr() {
		return isoDateFormatStr;
	}


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
