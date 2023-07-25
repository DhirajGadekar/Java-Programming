class MyThread extends Thread {

        MyThread(ThreadGroup pThreadGP, String str) {

                super(pThreadGP, str);
        }
        public void run() {

                
        }
}

class Main {

        public static void main(String[] args) throws InterruptedException {

                ThreadGroup pThreadGP = new ThreadGroup("C2W");

                MyThread t1 = new MyThread(pThreadGP, "C");
                MyThread t2 = new MyThread(pThreadGP, "Java");
                MyThread t3 = new MyThread(pThreadGP, "PyThon");

                t1.start();
                t2.start();
                t3.start();

		pThreadGP.list();
        }
}

