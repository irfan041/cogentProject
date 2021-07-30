package thread;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable{
	private String name;
	 
    public Task(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void run() {
        try {
            Long duration = (long) (Math.random() * 10);
            System.out.println(Thread.currentThread().getName()
    				+ " (Start) message = " + name);
            System.out.println("Executing : " + name);
            //System.out.println(duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
