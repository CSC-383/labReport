// question no 12

package labreport;

class sharedCounter implements Runnable {

    int count = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            count = count + 1;

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + count);
        

    }

}

class count {

    public static void main(String args[]) {
        Thread t1 = new Thread(new sharedCounter());
        Thread t2 = new Thread(new sharedCounter());
        Thread t3 = new Thread(new sharedCounter());
        Thread t4 = new Thread(new sharedCounter());
        Thread t5 = new Thread(new sharedCounter());
        Thread t6 = new Thread(new sharedCounter());
        Thread t7 = new Thread(new sharedCounter());
        Thread t8 = new Thread(new sharedCounter());
        Thread t9 = new Thread(new sharedCounter());
        Thread t10 = new Thread(new sharedCounter());

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t4.setName("Thread-4");
        t5.setName("Thread-5");
        t6.setName("Thread-6");
        t7.setName("Thread-7");
        t8.setName("Thread-8");
        t9.setName("Thread-9");
        t10.setName("Thread-10");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }
}



