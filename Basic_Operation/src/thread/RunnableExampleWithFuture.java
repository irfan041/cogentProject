package thread;

import java.util.Random;

public class RunnableExampleWithFuture {
	public static void main(String[] args) throws Exception 
    { 
        RunnableExample[] randomNumberTasks = new RunnableExample[5]; 
  
        for (int i = 0; i < 5; i++) 
        { 
            randomNumberTasks[i] = new RunnableExample(); 
            Thread t = new Thread(randomNumberTasks[i]); 
            t.start(); 
        } 
  
        for (int i = 0; i < 5; i++) 
            System.out.println(randomNumberTasks[i].get()); 
    } 
}

class RunnableExample implements Runnable {

	private Object result = null;

	public void run() {
		Random generator = new Random();
		Integer randomNumber = generator.nextInt(5);

		try {
			Thread.sleep(randomNumber * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		result = randomNumber;

		synchronized (this) {
			notifyAll();
		}
	}

	public synchronized Object get() throws InterruptedException {
		while (result == null)
			wait();

		return result;
	}
}
