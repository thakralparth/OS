package HelloWorldPrinter2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World, printed by thread: " + Thread.currentThread().getName());

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t =new Thread(hwp);
        t.start(); // creates a thread in OS and then calls run() for or class (hwp)

        System.out.println("After thread creation: " + Thread.currentThread().getName());
        //Both threads are independent of each other. Ours is a multi-core processor , so these threads are running in paarllel.
        // So they acan be printed in any order
        //Only in case of single threaded env. everything will be printed line by line
    }
}
