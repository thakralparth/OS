package Executors.printTillHundred;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService exec_service = Executors.newFixedThreadPool(10);

        for(int i=1;i<=100;i++){



            printNumber pn = new printNumber(i);
            exec_service.execute(pn);
//            Thread t=new Thread(pn);
//            t.start();
        }
    }
}
