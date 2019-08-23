
public class Delivery {
	/*
	 * Class:			Customer
	 * Description:		The class represents a single customer
	 * Author:			SihengLuo - s3786467
	 */
	
	private Customer customer;
	private Meal[] meals;
	DateTime deliveryDate;
	
	public Delivery(Customer customer) {
		this.customer = customer;
		this.meals = new Meal[0];
	}
	
	public void addMeal(Meal meal) {
		Meal[] meal1 = new Meal[meals.length+1];
		for(int i=0; i<meals.length; i++) {
			meal1[i] = meals[i];
		}
		meal1[meals.length] = meal;
		this.meals = meal1;
	}
	
	public boolean setDeliveryDate(int day, int month, int year) {
		if(month <= 0 || month > 12) {
			return false; 
		}
		if(year <= 0) {
			return false;
		}
		DateTime date = new DateTime(day, month, year);
		this.deliveryDate =  date;
		return true;
	}
	
	public String getDetails() {
		System.out.println("Customer:         " + this.customer +"\n");
		for(int i=0; i<meals.length; i++) {
			System.out.println("Meals:            " + this.meals[i] + "\n");	
		}
		if(deliveryDate != null) {
			System.out.println("Delivery Date:    " + this.deliveryDate);
		}
		else {
			System.out.println("Delivery Date: N/A");
		}
		return getDetails();
	}
	
	public String toString() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(this.customer);
		for(int i=0; i<meals.length; i++) {
			sb1.append(":" + this.meals[i]);	
		}
		if(deliveryDate != null) {
			sb1.append(":" + this.deliveryDate);
		}
		else{
			sb1.append(":" + "N/A");
		}
		return sb1.toString();
	}
}
