package com.lc.config;

import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.lc.controllers", "com.lc.validators", "com.lc.services" })
@PropertySources({
	@PropertySource("classpath:email.properties")
	})
public class LoveCalculateApplicationConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;

	private Logger logger = Logger.getLogger(LoveCalculateApplicationConfig.class.getName());
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	public JavaMailSender getJavaMailSender() {

		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();

		logger.info(">>>>>>>>>>>>fetching to host value: " + env.getProperty("mail.host"));
		
		javaMailSenderImpl.setHost(env.getProperty("mail.host"));
		javaMailSenderImpl.setUsername(env.getProperty("mail.username"));
		javaMailSenderImpl.setPassword(env.getProperty("mail.password"));
		javaMailSenderImpl.setPort(getIntProperties("mail.port"));
		
		javaMailSenderImpl.setJavaMailProperties(getMailProperty());

		return javaMailSenderImpl;
	}


	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");

		return messageSource;
	}

	@Bean
	public LocalValidatorFactoryBean validator() {

		LocalValidatorFactoryBean localValidatorBean = new LocalValidatorFactoryBean();
		localValidatorBean.setValidationMessageSource(messageSource());

		return localValidatorBean;
	}

	public Validator getValidator() {

		return validator();
	}

	private int getIntProperties(String key) {
		return Integer.valueOf(env.getProperty(key));
	}

	private Properties getMailProperty() {
		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		return mailProperties;
	}
}
