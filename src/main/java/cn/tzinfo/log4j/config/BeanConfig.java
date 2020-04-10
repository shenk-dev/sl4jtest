package cn.tzinfo.log4j.config;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:shenk
 * @Date: 2020/4/8
 * @Description:
 */
@Configuration
public class BeanConfig {

    //@Bean
    public ServletContextInitializer initParamsInitializer() {
        Map<String, String> contextParams = new HashMap<>();
        contextParams.put("logPath", "E:/abc");
        return new ServletContextInitializer() {
            @Override
            public void onStartup(ServletContext servletContext) throws ServletException {
                servletContext.setInitParameter("logPath", "E:/abc");
            }
        };
    }

}
