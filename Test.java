package strings;

public class Test {
	private static final CharSequence string = null;
	String street,city,country;
	public Test() {

	}
	public Test(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public boolean equals(Object o) {
		Test t=(Test)o;
				if (o == this) { 
					return true; 
				} 
				if (!(o instanceof Test)) { 
					return false; 
				}
				Test c = (Test) o; 
				 
		return (t.street.equals(this.street) && (t.city.equals(this.city)));
		//return (string.compare(street,this.street) && (string.compare(city,this.city)));

	}
}
