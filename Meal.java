import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class Meal{
	/*
	 * Class:			Meal
	 * Description:		The class represents a single meal
	 * Author:			SihengLuo - s3786467
	 */
	
	private String name;
	private MealCategory mealCategory;
	private ArrayList<String> basicIngredients;
	private ArrayList<String> additionalIngredients;
	private double cost;
	String doubleAsString = Double.toString(cost);
	
	// constant
	private double miniCost = 5.0;
	
	public Meal(String name, MealCategory mealCategory, String[] ingredients, double cost) {
		
		/*
		 * Attributes are not permitted to have an empty string values. 
		 * Values will be changed to "N/A" if an empty string is passed into the constructor.
		 */
		this.basicIngredients = new ArrayList<String>();
		this.additionalIngredients = new ArrayList<String>();

		if (name.equals("") || name.equals(" ")) { // Empty string check
            System.out.println("N/A");
		}
        else {
            this.name = name;
        }
		
		if(mealCategory==null) {
			System.out.println("N/A");
		}
		else {
			this.mealCategory = mealCategory;
		}

		/*
		 * A meal must have a minimum of two ingredients.
		 */
		if (ingredients.length < 2) {
			System.out.println("N/A");
		}
		
		if (ingredients.equals("") || ingredients.equals(" ")) { // Empty string check
            System.out.println("N/A");
		}
        else {
			for (String i : ingredients) {
				this.basicIngredients.add(i);
			}
        }
		
		/*
		 * invalid value will be set to -1.00
		 */
		if(cost >= this.miniCost) {
			this.cost = cost; //if input of cost great than zero, return to cost.
		}
		else {
			this.cost = -1;
		}
		
		/*
		 * If the ingredients list contains null values, the null values are removed.
		 */
		
		
		/*
		 * Each array must only be large enough to accommodate the number of items it holds.
		 */
		
		
	}
	
	/*
	 * If any of the ingredients are duplicated, the ingredients list is set to null.
	 */
	public Set<String> duplicateWords(String input){
		if(input == null || input.isEmpty()) {
			return Collections.emptySet();
			}
		Set<String> duplicates = new HashSet<>();
	  
		String[] words = input.split("\\s");
		Set<String> set = new HashSet<>();
	  
		for(String word : words)
		{
			if(!set.add(word)) {
				duplicates.add(word);
				}
			}
		return duplicates;
	}
	
	/*
	 * add the ingredient to the list of additional ingredients and add 50 cents to the cost of the meal
	 */
	public boolean addIngredient(String ingredients) {
		if(this.basicIngredients.contains(ingredients) || this.additionalIngredients.contains(ingredients)) {
			return false;
		}
		
		this.additionalIngredients.add(ingredients);
		this.cost += 0.5;
		return true;
	}
	
	/*
	 * remove an ingredient from either ingredient list and only reduce the cost of the meal by 50 cents if the 
	 * ingredient being removed is from the list of additional ingredients.
	 */
	public boolean removeIngredient(String ingredient) {
		if (this.basicIngredients.remove(ingredient)) {
			return true;
		}
		
		if (this.additionalIngredients.remove(ingredient)) {
			this.cost -= 0.5;
			return true;
		}
		
		return false;
	}
	
	
	public void getDetailsAddition() {

		System.out.println("Name:        " + this.name);
		System.out.println("Category:    " + this.mealCategory);
		System.out.println("Ingredients: " + this.basicIngredients.toString());
		if (this.additionalIngredients.size() != 0) {
			System.out.println("Additional: " + this.additionalIngredients.toString());
		}
		System.out.println("Cost:        " + this.cost +"\n");
	}
	
	/*
	 * return to its calling method
	 * formatted into a pre-defined format 
	 */
	public String toString() {
		String category = "";
		switch(mealCategory) {
		case INDIAN:
			category = "INDIAN";
			break;
		case VIETNAMESE:
			category = "VIETNAMESE";
			break;
		case CHINESE:
			category = "CHINESE";
			break;
		case KOREAN:
			category = "KOREAN";
			break;
		case JAPANESE:
			category= "JAPANESE";
			break;
		case EUROPEAN:
			category = "EUROPEAN";
			break;
		case MIDDLE_EASTERN:
			category = "MIDDLE_EASTERN";
			break;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(":" + category);
		sb.append(":" + basicIngredients);
		if(this.additionalIngredients.size() != 0) {
			sb.append(":" + additionalIngredients);
		}
		else{
			sb.append(":" + "None");
		}
		sb.append(":" + cost);
		return sb.toString();
	}
	
	
	
}
