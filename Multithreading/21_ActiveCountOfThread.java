class MyThread extends Thread {

        public void run() {

                System.out.println("Active Count of Thread : " + Thread.activeCount());
        }
}

class Main {

        public static void main(String[] args) {

                MyThread obj = new MyThread();
                obj.start();
		
        }
}
