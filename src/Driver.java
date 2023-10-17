public class Driver implements Runnable {
	public static void main(String[] args) {
		Thread gameloop = new Thread(new Driver());
		Thread frame = new Thread(Frame.getInstance());
		gameloop.start();
		frame.start();
	}

	@Override
	public void run() {
		double fps = 120;
		double delta = 0;
		long timeBefore = System.nanoTime();
		long timeNow;
		
		while(true) {
			timeNow = System.nanoTime();
			delta += (timeNow - timeBefore) / (1000000000 / fps);
			timeBefore = timeNow;
			
			if(delta >= 1) {
				Frame.getInstance().repaint();
				delta--;
			}
		}
	}
}
