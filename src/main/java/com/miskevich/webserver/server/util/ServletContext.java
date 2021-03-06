package com.miskevich.webserver.server.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

public class ServletContext {

    private final Logger LOG = LoggerFactory.getLogger(getClass());
    private Map<String, HttpServlet> servletHolder;

    public ServletContext() {
        this.servletHolder = new HashMap<>();
    }

    public void addServlet(String path, HttpServlet servlet) {
        servletHolder.put(path, servlet);
        LOG.info("Servlet " + servlet + " was registered by path " + path);
    }

    public HttpServlet getServlet(String path) {
        return servletHolder.get(path);
    }

    public Map<String, HttpServlet> getServletHolder() {
        return servletHolder;
    }
}
