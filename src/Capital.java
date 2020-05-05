package ai;

public class Capital {
	
	private String country;
	private String continent;
	private String capitalName;
	private ControlTower controltw;
	
	public Capital(String capitalName, ControlTower controltw) {
		this.capitalName = capitalName;
		this.controltw = controltw;
	}
	
	public String getCountry() {
		return country;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public String getContinent() {
		return continent;
	}
	public ControlTower getControltw() {
		return controltw;
	}

	public boolean signalFromControlTower() {
		return controltw.cancelFlight();
	}
	public int delaySignal(int a) {
		return controltw.delay(a);
	}

}
