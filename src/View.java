import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class View extends JPanel {
	static View INSTANCE;
	BufferedImage image;
	
	private View() {
		
	}
	
	public static synchronized View getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new View();
		}
		
		return INSTANCE;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		refreshImage();
		
		g.drawImage(image, (getWidth() - image.getWidth()) / 2, (getHeight() - image.getHeight()) / 2, image.getWidth(), image.getHeight(), null);
	}
	
	public void refreshImage() {
		Map map = new Map(10);
		int size = 50;
		int width = map.size * size + 1;
		int height = map.size * size + 1;
		
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics g  = image.getGraphics();
		
		g.setColor(Color.BLACK);
		for(int i = 0; i < map.size; i++) {
			for(int j = 0; j < map.size; j++) {
				width = size;
				height = size;
				int x = j * width;
				int y = i * height;
				
				g.drawRect(x, y, width, height);
			}
		}
		
		Player player = Player.getInstance();
		g.setColor(Color.RED);
		width = size;
		height = size;
		int x = player.x * size;
		int y = player.y * size;
		
		g.fillRect(x, y, width, height);
		
//		System.out.println(x + ", " + y);
	}
}
