package ExpressionCalculator;

public class Number implements ArithmeticExpression {
	private int value;
	public Number(int value) {
		this.value = value;
	}
	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return value;
	}

}
