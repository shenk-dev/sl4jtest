package cn.tzinfo.log4j;

import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author:shenk
 * @Date: 2020/4/14
 * @Description:
 */
public class MultiRollingLogTest {

    static Logger logger = LoggerFactory.getLogger(MultiRollingLogTest.class);

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadContext.put("DEVICECODE", "A0001");
                int i = 0;
                while(i++<100) {
                    logger.info("Hello World!");
                }
            }
        },"T1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadContext.put("DEVICECODE", "A0002");
                int i = 0;
                while(i++<100) {
                    logger.info("Hello World!");
                }
            }
        },"T2").start();
    }
}
