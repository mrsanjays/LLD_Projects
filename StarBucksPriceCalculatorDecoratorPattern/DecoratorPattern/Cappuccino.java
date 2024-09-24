package DecoratorPattern;

public class Cappuccino  extends Beverage{
	public Cappuccino() {
		// TODO Auto-generated constructor stub
		beverageName = "Cappuccino Coffee";
	}

	@Override
	public double getBeveragePrice() {
		// TODO Auto-generated method stub
		return 120;
	}

}
