package printTill_100_3;

public class Client {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            printNumber pn = new printNumber(i);
            Thread t=new Thread(pn);
            t.start();
        }
    }
}
