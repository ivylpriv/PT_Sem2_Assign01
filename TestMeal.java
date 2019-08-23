
public class TestMeal {

	public static void main(String[] args) {
		TestMeal test = new TestMeal();
		test.testPassInstantiation();
		test.testFailInstantiation();
		test.testFailAddIngredient();
		test.testPassAddIngredient();
		test.testFailRemoveIngredient();
			}
	
	public void testPassInstantiation(){
		Meal mealNoAdditions = new Meal("Tony", MealCategory.CHINESE, new String[] {
				"Lettuce", "Potato", "Chicken", "Cheese"
			}, 21.4);
			
			mealNoAdditions.getDetailsAddition();
			System.out.println(mealNoAdditions + "\n");
	}
	
	public void testFailInstantiation(){
		Meal mealFail = new Meal("   ", MealCategory.EUROPEAN, new String[] {"    ", "???????"}, -1.0 );
		
		mealFail.getDetailsAddition();
		System.out.println(mealFail + "\n");
	}
	
	public void testFailAddIngredient() {
		String[] ingredients = {"apple", "orange"};
		Meal mealFailAdd = new Meal("A", MealCategory.INDIAN, ingredients, -1.00);
		mealFailAdd.addIngredient(" ");
		System.out.println(mealFailAdd);
		mealFailAdd.getDetailsAddition();
	}
	
	public void testPassAddIngredient() {
		String[] ingredients = {"cheese", "bacon", "egg"};
		Meal mealPassAdd = new Meal("Python", MealCategory.MIDDLE_EASTERN, ingredients, 19.5);
		mealPassAdd.addIngredient("lettuce");
		System.out.println(mealPassAdd);
		mealPassAdd.getDetailsAddition();
	}
	
	public void testFailRemoveIngredient() {
		String[] ingredients = {"apple", "orange"};
		Meal meal = new Meal("Python", MealCategory.MIDDLE_EASTERN, ingredients, 19.5);
		meal.addIngredient("lettuce");
		System.out.println(meal);
		meal.getDetailsAddition();
		meal.removeIngredient("lettuce");
		System.out.println(meal);
		meal.getDetailsAddition();
	}

}
