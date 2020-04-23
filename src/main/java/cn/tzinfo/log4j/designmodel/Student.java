package cn.tzinfo.log4j.designmodel;

/**
 * @Author:shenk
 * @Date: 2020/4/21
 * @Description:创建者模式
 */
public class Student {

    private String name;

    private int age;

    private String sex;

    private String remark;

    public static class Builder {

        Student student = new Student();

        Builder name(String name) {
            student.name = name;
            return this;
        }

        Builder age(int age) {
            student.age = age;
            return this;
        }

        Builder remark(String remark) {
            student.remark = remark;
            return this;
        }

        Student build() {
            return student;
        }
    }

    public static void main(String[] args) {
        Student s = new Student.Builder().name("sk").build();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("My Shutdown Hook!");
            }
        }));
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1/0;
            }
        });
        t.setUncaughtExceptionHandler((k, e) -> {
                System.out.println("uncaught exception...");
            }
        );
        /*new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("uncaught exception...");
            }
        }*/
        System.out.println(s.name);
        t.start();
    }
}
