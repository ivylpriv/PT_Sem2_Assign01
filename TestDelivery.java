import java.util.Scanner;
public class TestDelivery {

	public static void main(String []args) {
		TestDelivery test = new TestDelivery();
		test.testAddMeal();
		test.testSetDeliveryDate();
		test.dynamicTest();
	}
	
	public void testAddMeal() {
		Customer C0 = new Customer("Tony", "Stark","35", "Collins Street", "Bendigo", "2006");
		System.out.println(C0.getDetail());
		System.out.println(C0);
		Meal mealNoAdditions = new Meal("Tony Stark", MealCategory.CHINESE, new String[] {
				"Lettuce", "Potato", "Chicken", "Cheese"
			}, 21.4);	
		mealNoAdditions.getDetailsAddition();
		System.out.println(mealNoAdditions);
		Delivery delivery = new Delivery(C0);
		delivery.addMeal(mealNoAdditions);
		System.out.println(delivery + "\n" + "\n");
	}
	
	public void testSetDeliveryDate() {
		Customer C0 = new Customer("Tony", "Stark","35", "Collins Street", "Bendigo", "2006");
		System.out.println(C0.getDetail());
		System.out.println(C0);
		Meal mealNoAdditions = new Meal("Tony Stark", MealCategory.CHINESE, new String[] {
				"Lettuce", "Potato", "Chicken", "Cheese"
			}, 21.4);	
		mealNoAdditions.getDetailsAddition();
		System.out.println(mealNoAdditions);
		Delivery delivery = new Delivery(C0);
		delivery.addMeal(mealNoAdditions);
		delivery.setDeliveryDate(23, 8, 2019);
		System.out.println(delivery + "\n" + "\n");
	}
	
	public void dynamicTest() {
		Scanner scan = new Scanner(System.in);
		String firstname, lastname, suburb, postcode, streetNo, streetName;
		System.out.println("Enter the customer");
		System.out.print("Firstname: ");
		firstname = scan.nextLine();
		System.out.print("Lastname: ");
		lastname = scan.nextLine();
		System.out.print("Street Number: ");
		streetNo = scan.nextLine();
		System.out.print("Suburb: ");
		suburb = scan.nextLine();
		System.out.print("Street Name: ");
		streetName = scan.nextLine();
		System.out.print("PostCode: ");
		postcode = scan.nextLine();
		Customer customer = new Customer(firstname, lastname, streetNo, streetName, suburb, postcode);
		Meal mealNoAdditions = new Meal(firstname + lastname, MealCategory.CHINESE, new String[] {
				"Lettuce", "Potato", "Chicken", "Cheese"
			}, 21.4);	
		mealNoAdditions.getDetailsAddition();
		System.out.println(mealNoAdditions);
		Delivery delivery = new Delivery(customer);
		delivery.addMeal(mealNoAdditions);
		delivery.setDeliveryDate(23, 8, 2019);
		System.out.println(delivery + "\n" + "\n");
	}
}
