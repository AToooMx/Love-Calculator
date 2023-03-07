/*
 * package com.lc.config;
 * 
 * import javax.servlet.ServletContext; import javax.servlet.ServletException;
 * import javax.servlet.ServletRegistration;
 * 
 * import org.springframework.web.WebApplicationInitializer; import
 * org.springframework.web.context.support.
 * AnnotationConfigWebApplicationContext; import
 * org.springframework.web.servlet.DispatcherServlet;
 * 
 * public class LoveCalculateApplicationInitializer //implements
 * WebApplicationInitializer {
 * 
 * //@Override public void onStartup(ServletContext servletContext) throws
 * ServletException {
 * 
 * AnnotationConfigWebApplicationContext webApplicationContext = new
 * AnnotationConfigWebApplicationContext();
 * webApplicationContext.register(LoveCalculateApplicationConfig.class);
 * 
 * // Create dispatcher servlet onject DispatcherServlet dispatcherServlet = new
 * DispatcherServlet(webApplicationContext);
 * 
 * // Register dispatcher servlet with servlet context
 * ServletRegistration.Dynamic myDispatcherServlet =
 * servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
 * 
 * myDispatcherServlet.setLoadOnStartup(1);
 * myDispatcherServlet.addMapping("/mywebsite.com/*");
 * 
 * }
 * 
 * }
 */