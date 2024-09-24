package DecoratorPattern;

public class Caramel extends AddOnsDecorator{
	Beverage beverage;
	public Caramel(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getBeverageName() {
		// TODO Auto-generated method stub
		return beverage.getBeverageName() + ", Added with Caramel";
	}

	@Override
	public double getBeveragePrice() {
		// TODO Auto-generated method stub
		return beverage.getBeveragePrice() + 40;
	}

}
