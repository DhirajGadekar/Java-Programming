import java.util.concurrent.*;

class MyThread implements Runnable {

        int num;
        MyThread(int num) {

                this.num = num;
        }
        public void run() {

                System.out.println(Thread.currentThread() + " Start Thread : " + num);
                dailyTask();
                System.out.println(Thread.currentThread() + " End Thread : " + num);
        }
        void dailyTask() {

                try {

                        Thread.sleep(5000);
                } catch(InterruptedException ie) {

                        ie.printStackTrace();
                }
        }
}

class Main {

        public static void main(String[] args) {

                ExecutorService es = Executors.newSingleThreadExecutor();

                for(int i = 1; i < 10; i++) {

                        MyThread t = new MyThread(i);
                        es.execute(t);
                }

                es.shutdown();
        }
}
