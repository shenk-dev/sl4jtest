package cn.tzinfo.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author:shenk
 * @Date: 2020/4/8
 * @Description:
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Application {

    static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        System.setProperty("userName","shenk");
        SpringApplication.run(Application.class, args);
        logger.info("Hello World!");
    }
}
