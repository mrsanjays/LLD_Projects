package ExpressionCalculator;

public class Expression implements ArithmeticExpression {
	private ArithmeticExpression leftExpression;
	private ArithmeticExpression rightExpression;
	private Operations operation;
	
	public Expression(ArithmeticExpression leftExpression , ArithmeticExpression rightExpression , Operations operation) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
		this.operation = operation;
		
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		int result = -1;
		switch (operation) {
		case ADD:
			result = this.leftExpression.evaluate() + this.rightExpression.evaluate();
			break;
		case SUBTRACT:
			result = this.leftExpression.evaluate() - this.rightExpression.evaluate();
			break;
		case MULTIPLY:
			result = this.leftExpression.evaluate() * this.rightExpression.evaluate();
			break;
		case DIVIDE:
			result = this.leftExpression.evaluate() / this.rightExpression.evaluate();
			break;
		default:
			System.out.println("Illegal Operation !");
			break;
			
		}		
		return result;
	}
	
}
