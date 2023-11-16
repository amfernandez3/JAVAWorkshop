package com.cursojava.servlets;

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
    public ServletRegistrationBean<Alta> AltaservletRegistrationBean() {
        return new ServletRegistrationBean<>(new Alta(), "/Alta");
    }

    /**
     * Servlet que responde a la petición HTTP /Eliminacion
     * @return respuesta a la petición HTTP
     */
    @Bean
    public ServletRegistrationBean<Eliminacion> EliminacionservletRegistrationBean() {
        return new ServletRegistrationBean<>(new Eliminacion(), "/Eliminacion");
    }

    /**
     * Servlet que responde a la petición HTTP /Busqueda
     * @return respuesta a la petición HTTP
     */
    @Bean
    public ServletRegistrationBean<Busqueda> BusquedaservletRegistrationBean() {
        return new ServletRegistrationBean<>(new Busqueda(), "/Eliminacion");
    }

    /**
     * Servlet que responde a la petición HTTP /Modificacion
     * @return respuesta a la petición HTTP
     */
    @Bean
    public ServletRegistrationBean<Modificacion> ModificacionservletRegistrationBean() {
        return new ServletRegistrationBean<>(new Modificacion(), "/Modificacion");
    }
}
