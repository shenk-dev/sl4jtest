package cn.tzinfo.log4j;


import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/**
 * @Author:shenk
 * @Date: 2020/4/20
 * @Description:
 */
public class OUtOfTime {

    public static void main(String[] args) throws InterruptedException {
        IOException exception = new IOException();
        System.out.println(exception.getMessage());
        Timer timer = new Timer();
        timer.schedule(new ThrowTask(), 1);
        Thread.sleep(1);
        timer.schedule(new ThrowTask(), 1);
        Thread.sleep(5);
    }
}

class ThrowTask extends TimerTask {

    int i = 0;

    @Override
    public void run() {
        System.out.println(UUID.randomUUID().toString());
        throw new RuntimeException();
    }
}
