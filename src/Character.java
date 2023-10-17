
public class Character {
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void moveUp() {
		y--;
	}
	
	public  void moveDown() {
		y++;
	}

	public void moveLeft() {
		x--;
	}
	
	public void moveRight() {
		x++;
	}
}
