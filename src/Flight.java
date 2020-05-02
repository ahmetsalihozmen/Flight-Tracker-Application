import java.util.ArrayList; 
public class Flight {

	private String arrivalTime; 
	private String airlines;
	private String aircraftModel;
	private String departure;
	public ArrayList<String> weekdays;
	private String flightNO;	
	private float timeTaken; // minutes
	public Capital from, to;
	private boolean isAvailable;
	public Flight(String arrivalTime,String airlines,String aircraftModel,String departure, 
				  ArrayList<String> weekdays, String flightNO,float timetaken,Capital from,Capital to) {
		this.arrivalTime = arrivalTime;
		this.airlines = airlines;
		this.aircraftModel = aircraftModel;
		this.departure = departure;
		this.weekdays = new ArrayList<String>();
		this.flightNO = flightNO;
		this.timeTaken = timetaken;
		this.from = from;
		this.to = to;
		this.isAvailable = true;
	}
	
	public Capital getFrom() {
		return from;
	}
	public Capital getTo() {
		return to;
	}
	public float getTimeTaken() {
		return timeTaken;
	}
	public String getFlightNO() {
		return flightNO;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public String getDeparture() {
		return departure;
	}
	public String getAirlines() {
		return airlines;
	}
	public String getAircraftModel() {
		return aircraftModel;
	}
	public String getWeekdays() {
		String result = "";
		for(String i: this.weekdays) {
			result = result + String.valueOf(i.charAt(0)) + String.valueOf(i.charAt(1))+", ";
		}
		return result;
	}
	
	public void setAirlines(String a) {
		this.airlines = a;
	}

	public void setTo(Capital to) {
		this.to = to;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setAircraftModel(String aircraftModel) {
		this.aircraftModel = aircraftModel;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public void setTimeTaken(float timeTaken) {
		this.timeTaken = timeTaken;
	}

	public void setFrom(Capital from) {
		this.from = from;
	}

	public boolean getStatus() {
		return this.isAvailable;
	}
	
	public void cancel() {
		if(from.getControltw().cancelFlight() == false) {
			this.isAvailable = false;
		}
		else if(to.getControltw().cancelFlight() == false) {
			this.isAvailable = false;
		}
		else {
			System.out.println("The control tower has not canceled the flight.");
		}
	}
	
	public void addWeekday(String newDay) {
		this.weekdays.add(newDay);
	}
	public void deleteWeekday(String deleteDay) {
		this.weekdays.remove(deleteDay);
	}
	
}
