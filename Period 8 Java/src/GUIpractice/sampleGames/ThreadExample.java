package GUIpractice.sampleGames;

public class ThreadExample implements Runnable{
	
	private int number;
	private int sleepTime;
	
	public static void main(String[] args)
	{
		Thread one = new Thread(new ThreadExample(1));
		Thread two = new Thread(new ThreadExample(2));
		Thread three = new Thread(new ThreadExample(3));
		one.start();
		two.start();
		three.start();
		
	}

	public ThreadExample(int x) {
		// TODO Auto-generated constructor stub
		number = x;
		sleepTime = (int) (Math.random() * 1000);//cause possible delay in the printing
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread number " + number + " preparing to sleep for " + sleepTime + "ms");//printing all at the same time 
		try {
			Thread.sleep(sleepTime);
			System.out.println("Thread number " + number + " woke up");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
