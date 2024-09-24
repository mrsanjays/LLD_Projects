package DecoratorPattern;

public class Milk extends AddOnsDecorator{
	Beverage beverage;
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		
	}

	@Override
	public String getBeverageName() {
		// TODO Auto-generated method stub
		return this.beverage.getBeverageName() + ", Added with Milk ";
		
	}

	@Override
	public double getBeveragePrice() {
		// TODO Auto-generated method stub
		return beverage.getBeveragePrice() + 10;
	}

}
