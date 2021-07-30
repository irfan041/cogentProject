package cogent_Assis;

class MyThread implements Runnable {
	@Override
	public void run() {
		Thread t = new Thread();
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "," + t.getPriority());
			try {
				Thread.sleep(2500);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread th = new Thread(t);
		th.start();
		for (int i = 20; i < 30; i++) {
			System.out.println(i + "," + th.getPriority());
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}


//sleep(),join(),yield()// Interthread communication
