import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputController implements KeyListener {
	Player player;
	
	public InputController() {
		player = Player.getInstance();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP: player.moveUp(); break;
		case KeyEvent.VK_DOWN: player.moveDown(); break;
		case KeyEvent.VK_LEFT: player.moveLeft(); break;
		case KeyEvent.VK_RIGHT: player.moveRight(); break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
