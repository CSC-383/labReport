// question no 12
package labreport;

class Counter {

    private int val;

    public Counter() {
        val = 0;
    }

    public void increment() {
        val = val + 1;
    }

    public int getVal() {
        return val;
    }
}

class IncThread extends Thread {

    int numOfThread = 10;
    Counter myCounter;

    public IncThread(Counter c) {
        myCounter = c;
    }

    public void run() {
        for (int i = 1; i <= numOfThread; i++) {
            myCounter.increment();
        }
    }

}

public class sharedCounter {

    public static void main(String[] args) {
        Counter c = new Counter();

        Thread inc = new IncThread(c);

        inc.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("The final value of counter after finished all thread: " + c.getVal() * 10);

    }
}
