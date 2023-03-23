package Executors.printTillHundred;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService exec_service = Executors.newFixedThreadPool(10);
//         ExecutorService exec_service = Executors.newSingleThreadExecutor();
//        ExecutorService exec_service = Executors.newCachedThreadPool();


        for(int i=1;i<=100;i++){

            if(i==5 || i==11 || i==20){
                System.out.println("Debug");
            }

            printNumber pn = new printNumber(i);
            exec_service.execute(pn);
//            Thread t=new Thread(pn);
//            t.start();
        }

        exec_service.shutdown();
    }
}
