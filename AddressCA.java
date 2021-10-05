public class AddressCA {
	private String street, city;
	private int houseNumber;

	public AddressCA(int houseNumber, String street, String city) 
	{
		// FILL IN CODE: assign values to instance variables
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	/**
	 * Returns true if the cities and the streets are the same for "this" address and otherAddress. 
	 * The method returns false otherwise.
	 * @param otherAddress
	 * @return true if the cities and streets are the same, and false otherwise
	 */
	public boolean sameStreet(AddressCA otherAddress) {
		// FILL IN CODE
		
		if (this.street.equals(otherAddress.street))
			return true;
		else
			return false;

	}
}
