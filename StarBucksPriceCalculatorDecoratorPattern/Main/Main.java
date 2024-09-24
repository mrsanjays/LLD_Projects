package Main;

import DecoratorPattern.Beverage;
import DecoratorPattern.Cappuccino;
import DecoratorPattern.Caramel;
import DecoratorPattern.Espresso;
import DecoratorPattern.Milk;

public class Main {
	public static void main(String[] args) {
		
		// creating Cappuccino and calculate Price
		
		Beverage newItem = new Cappuccino();
		System.out.println(newItem.getBeverageName() +" Price : "+ newItem.getBeveragePrice());
	
		
		System.out.println("Price after Adding Single layer of Milk as an Add ons ");
		newItem = new Milk(newItem);
		System.out.println(newItem.getBeverageName() +" Price : "+ newItem.getBeveragePrice());

		
		//creating Espresso with double layer of Caramel and Single layer of Milk and Calculate Price
		
		Beverage newItem1 = new Espresso();
		System.out.println(newItem1.getBeverageName() +" Price : "+ newItem1.getBeveragePrice());
		System.out.println("Price after Adding double layer of Caramel and Single layer of Milk as an Add ons ");
		newItem1 = new Caramel(newItem1);
		newItem1 = new Caramel(newItem1); // double layer
		newItem1 = new Milk(newItem1); 
		
		System.out.println(newItem1.getBeverageName() +" Price : "+ newItem1.getBeveragePrice());
		
		
		
		
		
	}

	

}
