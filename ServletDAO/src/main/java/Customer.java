public class Customer {
	private String username,location,address,business,noofemp;

	public Customer(String username, String location, String address, String business, String noofemp) {
		super();
		this.username = username;
		this.location = location;
		this.address = address;
		this.business = business;
		this.noofemp = noofemp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getNoofemp() {
		return noofemp;
	}

	public void setNoofemp(String noofemp) {
		this.noofemp = noofemp;
	}
}
