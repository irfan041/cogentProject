package cogent_Assis;

class MyT1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}

public class MyThread2 {
	public static void main(String[] args) {
		MyT1 m = new MyT1();
		// MyT2 m1=new MyT2();
		// m1.start();
		m.start();
		Thread t = new Thread();

		for (int j = 20; j < 30; j++) {
			System.out.println(j);

			m.yield();

		}
	}
}
