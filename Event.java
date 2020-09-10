package abs;

public class Event {
	protected String name;
	protected String details;
	protected String ownerName;
	public Event() {
		
	}
	public Event(String name, String details, String ownerName) {
		super();
		this.name = name;
		this.details = details;
		this.ownerName = ownerName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double ProjectedRevenue() {
		return 0;
		
	}

}
