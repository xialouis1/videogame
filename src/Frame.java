import javax.swing.JFrame;

public class Frame extends JFrame implements Runnable {

	private static Frame INSTANCE;
	
	private Frame() {
		add(View.getInstance());
		addKeyListener(new InputController());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static synchronized Frame getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Frame();
		}
		
		return INSTANCE;
	}
	
	@Override
	public void run() {
		repaint();
	}

}
