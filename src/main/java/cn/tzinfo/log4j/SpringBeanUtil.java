package cn.tzinfo.log4j;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author:shenk
 * @Date: 2020/4/8
 * @Description:
 */
@Component
public class SpringBeanUtil implements ApplicationContextAware {

    static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanUtil.applicationContext = applicationContext;
    }

    public static  <T>T getBean(Class<T> clz) {
        return applicationContext.getBean(clz);
    }
}
