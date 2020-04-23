package cn.tzinfo.log4j.designmodel;

/**
 * @Author:shenk
 * @Date: 2020/4/21
 * @Description:责任链模式
 */
public class ResponsibilityChain {

    static void doChain(Handler handler, Request request) {

        if(handler.canHandle(request)) {
            handler.handleRequest(request);
        }else {
            Handler successor = handler.getSuccessor();
            if(successor != null) {
                doChain(successor, request);
            }
        }
    }

    public static void main(String[] args) {
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();

        handlerA.successor = handlerB;
        doChain(handlerA, new Request());


    }
}

interface Handler {

    void handleRequest(Request request);

    boolean canHandle(Request request);

    Handler getSuccessor();
}


class HandlerA implements Handler {

    Handler successor;

    @Override
    public void handleRequest(Request request) {
        System.out.println("HandlerA handle...");
    }

    @Override
    public boolean canHandle(Request request) {
        return false;
    }

    @Override
    public Handler getSuccessor() {
        return successor;
    }
}


class HandlerB implements Handler {

    Handler successor;

    @Override
    public void handleRequest(Request request) {
        System.out.println("HandlerB handle...");
    }

    @Override
    public boolean canHandle(Request request) {
        return true;
    }

    @Override
    public Handler getSuccessor() {
        return successor;
    }
}

class Request {

}
