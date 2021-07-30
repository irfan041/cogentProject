package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);// creating a
																	// pool of 2
																	// threads
		for (int i = 1; i <= 5; i++) {
			WorkerThread1 worker = new WorkerThread1("Task " + i);
			 System.out.println("Created : " + worker.getMessage());
			executor.execute(worker);// calling execute method of
										// ExecutorService
			}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}
