package cn.tzinfo.log4j;

import cn.tzinfo.log4j.es.repositroy.AlarmLogRepository;
import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;

/**
 * @Author:shenk
 * @Date: 2020/4/7
 * @Description:
 */
public class Test {

    static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
          logger.info("Hello World");
//        ThreadContext.put("user_id", "sk");
//        System.out.println(logger);
//        logger.info("i love {}", "you");
//        System.out.println(MDC.get("user_id"));
//        MyThread myThread = new MyThread();
//        myThread.start();
//        myThread.showCurrentThread();
//        SpringApplication.run(Application.class, args);//start a demon thread
//        System.out.println(SpringBeanUtil.getBean(AlarmLogRepository.class));
    }
}
