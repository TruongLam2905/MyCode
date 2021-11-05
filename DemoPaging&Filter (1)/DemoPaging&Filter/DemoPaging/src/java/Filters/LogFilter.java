/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import javax.servlet.Filter;

/**
 *
 * @author lephu
 */
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author lephu
 */
public class LogFilter implements Filter{

    private String filelog;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        filelog = filterConfig.getInitParameter("logfile");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       
        HttpServletRequest req = (HttpServletRequest) request;
        String filename = req.getServletContext().getRealPath("") + filelog;
        File file = new File(filename);
        if (!file.exists())
            file.createNewFile();
        FileWriter writer = new FileWriter(filename, true);
        writer.write(req.getServletPath() + "-" + LocalDateTime.now().toString() + "\n");
        writer.close();
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
    
}
