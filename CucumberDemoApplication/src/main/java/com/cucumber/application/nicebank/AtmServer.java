package com.cucumber.application.nicebank;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by pradeep on 16/10/16.
 */
public class AtmServer {

    private Server server;

    public AtmServer(int port) {
        server = new Server(port);
        ServletContextHandler servletContextHandler = new ServletContextHandler();
        servletContextHandler.setContextPath("/");
        servletContextHandler.addServlet(new ServletHolder(new AtmServlet()), "/*");
        server.setHandler(servletContextHandler);
    }

    public static void main(String... args) throws Exception {
        new AtmServer(9988).start();
    }

    public void start() throws Exception {
        server.start();
        System.out.println("Server started and listening at : " + server.getURI());
    }

    public void stop() throws Exception {
        server.stop();
        System.out.println("Server stopped");
    }
}
