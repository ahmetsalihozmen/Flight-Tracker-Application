package ai;

public class ControlTower {
	public String towerName;
	
	public ControlTower(String towerName) {
		this.towerName = towerName;
	}
	
	public boolean cancelFlight() {
		return false;
	}
	public int delay(int a) {
		return a;
	}
}
