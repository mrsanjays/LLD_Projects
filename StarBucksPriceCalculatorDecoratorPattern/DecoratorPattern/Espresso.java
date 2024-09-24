package DecoratorPattern;

public class Espresso  extends Beverage{
	public Espresso() {
		beverageName = "Espresso Coffee";
	}

	@Override
	public double getBeveragePrice() {
		
		return 100;
	}

}
