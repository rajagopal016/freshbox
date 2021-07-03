package Threading;

public class HelloRunner implements Runnable{
	int i;
	public void run() { //Runnable interface has a method in it called run()
		i = 0;
		while(true) {
			System.out.println("Hello" + i++);
			if(i==50) {
				break;
			}
		}
	}

}
