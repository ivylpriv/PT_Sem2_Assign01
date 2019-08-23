
public class Customer {
	/*
	 * Class:			Customer
	 * Description:		The class represents a single customer
	 * Author:			SihengLuo - s3786467
	 */
	
	private String firstName;
	private String lastName;
	private String streetNo;
	private String streetName;
	private String suburb;
	private String postcode;
	
	public Customer(String firstName, String lastName,
			String streetNo, String streetName, String suburb, String postcode)
	{
		/*
		 * First rule: attributes are not permitted to have an empty string assigned to its value
		 * nor can they be assigned null values.
		 */
		if(firstName==null) {
			System.out.println("N/A");
		}
		else {
			this.firstName = firstName;
		}
		if (firstName.equals("") || firstName.equals(" ")) { // Empty string check
            System.out.println("N/A");
		}
        else {
            this.firstName = firstName;
        }
		
		if(lastName==null) {
			System.out.println("N/A");
		}
		else {
			this.lastName = lastName;
		}
		if (lastName.equals("") || lastName.equals(" ")) { // Empty string check
            System.out.println("N/A");
		}
        else {
            this.lastName = lastName;
        }
		
		if(streetName==null) {
			System.out.println("N/A");
		}
		else {
			this.streetName = streetName;
		}
		if (streetName.equals("") || streetName.equals(" ")) { // Empty string check
            System.out.println("N/A");
		}
        else {
            this.streetName = streetName;
        }
		
		if(streetNo==null) {
			System.out.println("N/A");
		}
		else {
			this.streetNo = streetNo;
		}
		if (streetNo.equals("") || streetNo.equals(" ")) { // Empty string check
            System.out.println("N/A");
		}
        else {
            this.streetNo = streetNo;
        }
		
		if(suburb==null) {
			System.out.println("N/A");
		}
		else {
			this.suburb = suburb;
		}
		if (suburb.equals("") || suburb.equals(" ")) { // Empty string check
            System.out.println("N/A");
		}
        else {
            this.suburb = suburb;
        }
		
		if(postcode==null) {
			System.out.println("N/A");
		}
		else {
			this.postcode = postcode;
		}
		if (postcode.equals("") || postcode.equals(" ")) { // Empty string check
            System.out.println("N/A");
		}
        else {
            this.postcode = postcode;
        }
		
		/*
		 * Second rule: the postcode must be exactly four characters, consist only of the numeric characters 
		 * and the first character must be a digit from 1-8. 
		 */
		if(postcode.substring(0).matches("[1-8].*+") && postcode.substring(1,3).matches("[0-9].*+"))
		{
			this.postcode = postcode; //connect variable with constructor
		}
		else {
			System.out.println("N/A");
		}
		System.out.print(postcode);
	}
	
	/*
	 *Third rule: if any of the above rules are violated, then the value of the relevant attribute should
	 *be set to N/A is completed above. 
	*/
	
	/*
	 * Create a getDetai to return all strings.
	 */
	public String getDetail() 
	{
		return "First Name: " + firstName + "\n" 
				+ "Last Name: " + lastName + "\n"
				+ "Street Number: " + streetNo + "\n"
				+ "Street Name: " + streetName + "\n"
				+ "Suburb: " + suburb + "\n"
				+ "Postcode: " + postcode;
	}
	
	/*
	 * Create a toSgtring
	 */
	public String toString()
	{
		return firstName + ":" + lastName + ":" + streetNo + ":" + streetName + ":" + suburb + ":" + postcode;
	}
}


