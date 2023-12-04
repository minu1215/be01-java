package quiz.Interface.ex01;

import java.util.Random;

public interface Trans {
	Thread t = new Thread();
	Random r = new Random();
	public abstract void start() throws InterruptedException;
	public abstract void stop() throws InterruptedException;	
}
