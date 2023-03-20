package IntroToThreads;

public class Client {

    public static void doSomething(){
        System.out.println("Do something, Printed by thread:" + Thread.currentThread().getName() );
        // A thread is basic unit of CPU execution
    }
    public static void main(String[] args) {
        //Main Thread
        System.out.println("Hello World , Printed by thread: " + Thread.currentThread().getName() );// executed by main thread in CPU

        doSomething();
    }
}
