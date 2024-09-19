
import ExpressionCalculator.*;
import ExpressionCalculator.Number;
public class MainForExpressionAdder {
	/*
	 *                * 
	 *              /   \
	 *             7     +
	 *                  /  \
	 *                 9    3
	 *                 
	 *             Result = 84
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticExpression sevenNumber = new Number(7);
		ArithmeticExpression nineNumber = new Number(9);
		ArithmeticExpression threeNumber = new Number(3);
		
		Expression addExpression = new Expression(nineNumber, threeNumber, Operations.ADD);
		
		Expression multiplyExpression = new Expression(sevenNumber, addExpression, Operations.MULTIPLY);
		System.out.println(" Result : " + multiplyExpression.evaluate());
		
		
		

	}

}
