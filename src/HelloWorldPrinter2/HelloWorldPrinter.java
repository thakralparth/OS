package HelloWorldPrinter2;

public class HelloWorldPrinter implements Runnable{

    public static void doSomething(){
        System.out.println("do SOmething" + Thread.currentThread().getName());
    }


    @Override
    public void run() {
        System.out.println("Hello World, printed by thread: " + Thread.currentThread().getName());

        doSomething();
    }
}
