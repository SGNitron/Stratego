
import java.util.ArrayList;

public abstract class Player {
	
	private ArrayList<Pieces> myPieces= new ArrayList<Pieces>();
	protected String team;
	
	public Player(Pieces other) {
		for (int i=0; i<10; ++i) {
			myPieces.add(new Scout());
		}
		for (int i=0; i<6; ++i) {
			myPieces.add(new Miner());
		}
		for (int i=0; i<5; ++i) {
			myPieces.add(new Sergeant());
		}
		for (int i=0; i<5; ++i) {
			myPieces.add(new Lieutenant());
		}
		for (int i=0; i<5; ++i) {
			myPieces.add(new Captain());
		}
		for (int i=0; i<4; ++i) {
			myPieces.add(new Major());
		}
		for (int i=0; i<2; ++i) {
			myPieces.add(new Colonel());
		}
		myPieces.add(new General());
		myPieces.add(new Marshall());
	}
	
	public abstract void attack(Pieces other);
	public abstract void move(Pieces other);

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
