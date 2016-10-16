package Test;

/**
 * Created by XiaochengWen on 16/10/13.
 */


public class test1 extends Thread{
    public test1(String name) {
        super(name);
    }

    public test1(){
        super();
    }

    static int num = 100;
    int times = 0;


    @Override
    public void run() {
        while (true) {
            synchronized ("suo") {
                if (num > 0) {
                       System.out.println(Thread.currentThread().getName() + ":" + num);
                        num -= 1;
                       this.times += 1;
                }else {
                    break;
                }
            }
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        test1 test1 = new test1("first");
        test1 test2 = new test1("second");
        test1 test3 = new test1("third");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(1);
        test1.start();
        test2.start();
        test3.start();
    }
}
