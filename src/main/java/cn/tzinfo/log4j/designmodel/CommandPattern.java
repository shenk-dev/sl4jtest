package cn.tzinfo.log4j.designmodel;

/**
 * @Author:shenk
 * @Date: 2020/4/22
 * @Description:命令模式
 * */
public class CommandPattern {
}

interface Command {
    void execute();
}

class TVCommand implements Command {

    TV TV;

    @Override
    public void execute() {
        TV.open();
    }
}

class LightCommand implements Command {

    Light light;

    @Override
    public void execute() {
        light.open();
    }
}

//Receiver
interface Electric {
    void open();
}

class TV implements  Electric {

    @Override
    public void open() {
        System.out.println("Open TV");
    }
}

class Light implements Electric {

    @Override
    public void open() {
        System.out.println("Open Light");
    }
}
