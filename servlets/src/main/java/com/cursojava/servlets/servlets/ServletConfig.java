package com.cursojava.servlets.servlets;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    /**
     * Servlet que responde a la petición HTTP /HolaMundoServlet
     * @return respuesta a la petición HTTP
     */
    @Bean
    public ServletRegistrationBean<HolaMundoServlet> servletRegistrationBean() {
        return new ServletRegistrationBean<>(new HolaMundoServlet(), "/HolaMundoServlet");
    }

    /**
     * Servlet que responde a la petición HTTP /TablaServlet
     * @return respuesta a la petición HTTP
     */
    @Bean
    public ServletRegistrationBean<TablaServlet> tablaServletRegistrationBean() {
        return new ServletRegistrationBean<>(new TablaServlet(), "/TablaServlet");
    }

    /**
     * Servlet que responde a la petición HTTP /TablaServletEntrada
     * @return respuesta a la petición HTTP
     */
    @Bean
    public ServletRegistrationBean<TablaServletEntrada> tablaServletEntradaRegistrationBean() {
        return new ServletRegistrationBean<>(new TablaServletEntrada(), "/TablaServletEntrada");
    }

    /**
     * Servlet que responde a la petición HTTP /ColorServlet
     * @return respuesta a la petición HTTP
     */
    @Bean
    public ServletRegistrationBean<ColorServlet> ColorServletRegistrationBean() {
        return new ServletRegistrationBean<>(new ColorServlet(), "/ColorServlet");
    }

    /**
     * Servlet que responde a la petición HTTP /LenguajesServlet
     * @return respuesta a la petición HTTP
     */
    @Bean
    public ServletRegistrationBean<LenguajesServlet> LenguajesServletRegistrationBean() {
        return new ServletRegistrationBean<>(new LenguajesServlet(), "/LenguajesServlet");
    }

    /**
     * Servlet que responde a la petición HTTP /PaisesServlet
     * @return respuesta a la petición HTTP
     */
    @Bean
    public ServletRegistrationBean<PaisesServlet> PaisesServletRegistrationBean() {
        return new ServletRegistrationBean<>(new PaisesServlet(), "/LenguajesServlet");
    }
}
