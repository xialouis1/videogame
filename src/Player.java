
public class Player extends Character {
	static Player INSTANCE;
	
	private Player() {
		
	}
	
	public static synchronized Player getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Player();
		}
		
		return INSTANCE;
	}
}
