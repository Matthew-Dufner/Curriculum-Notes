package servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //Do things for servlet context initialization...
        System.out.println("Servlet context init()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        //Do things for servlet context destruction...
        System.out.println("Servlet context destroy()");
    }
}