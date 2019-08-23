
public class TestCustomer {

	public static void main(String[] args) {
		TestCustomer test = new TestCustomer();
		test.testValid();
		test.testInvalid();
	}
	
	private void testValid() {
		Customer C0 = new Customer("Tony", "Stark","35", "Collins Street", "Bendigo", "2006");
		System.out.println(C0.getDetail());
		System.out.println(C0 + "\n");
		
		Customer C1 = new Customer("Natasha", "Romanoff", "48", "Swanston Street", "Bundoora", "7367");
		System.out.println(C1.getDetail());
		System.out.println(C1+ "\n");
		
        Customer C2 = new Customer("Steve", "Rogers", "73", "Russel Street", "Box Hill", "4301");
        System.out.println(C2.getDetail());
        System.out.println(C2+ "\n");
        
        Customer C3 = new Customer("Mecca", "Maxima", "47", "Ballarat Avenue", "Burwood", "3789");
        System.out.println(C3.getDetail());
        System.out.println(C3+ "\n");
        
        Customer C4 = new Customer("Sephora", "Cosmetics", "50", "A'Beckkete Street", "Brighton", "3790");
        System.out.println(C4.getDetail());
        System.out.println(C4+ "\n");
        
        Customer C5 = new Customer("Tom", "Hiddleston", "68", "London Street", "Caroline", "3950");
        System.out.println(C5.getDetail());
        System.out.println(C5+ "\n");
	}

	
	private void testInvalid(){
		Customer C0 = new Customer("Tony", "Stark","35", "Collins Street", "Bendigo", "d937");
		System.out.println(C0.getDetail());
		System.out.println(C0+ "\n"); 
		
		Customer C1 = new Customer("Tony", "Stark","35", "Collins Street", "Bendigo", "0000");
		System.out.println(C1.getDetail());
		System.out.println(C1+ "\n"); 
		
		Customer C2 = new Customer("Tony", "Stark","35", "Collins Street", "Bendigo", "8300287");
		System.out.println(C2.getDetail());
		System.out.println(C2+ "\n"); 
		
		Customer C3 = new Customer("Tony", "Stark","35", "Collins Street", "Bendigo", "9");
		System.out.println(C3.getDetail());
		System.out.println(C3+ "\n"); 
		
		Customer C4 = new Customer(" ", "Stark","35", "Collins Street", " ", "hdjshjakgjh");
		System.out.println(C4.getDetail());
		System.out.println(C4+ "\n"); 
	}
	
	
	

}
