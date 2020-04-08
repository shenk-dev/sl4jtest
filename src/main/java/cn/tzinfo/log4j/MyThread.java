package cn.tzinfo.log4j;

/**
 * @Author:shenk
 * @Date: 2020/4/7
 * @Description:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
    }

    public void showCurrentThread() {
        System.out.println(Thread.currentThread());
    }
}
