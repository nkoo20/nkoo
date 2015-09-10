package com.nkoo.web.interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;

import org.springframework.web.context.support.WebApplicationContextUtils;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener implements ServletContextListener {
	private final transient Log log = LogFactory.getLog(getClass());
    @SuppressWarnings("unused")
	public void contextInitialized(ServletContextEvent event) {
    	log.info("系统启动");
        ServletContext context = event.getServletContext();
        ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
    }

	@SuppressWarnings("unused")
	public static void setupContext(ServletContext context) {
        ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
    }

	@SuppressWarnings("unused")
	private static void doReindexing() {
    }
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
