package com.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServletApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {// Configuration classes
		Class<?> arr[] = { LoveCalculateApplicationConfig.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() { // Mapping
		String[] arr = { "/" };
		return arr;
	}

}
