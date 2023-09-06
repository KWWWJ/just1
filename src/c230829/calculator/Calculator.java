package c230829.calculator;

public class Calculator implements CalcInterface {
	public double calculate(String operator, double...nums) {
		switch(operator) {
		case "+" :
			return CalcInterface.super.add(nums);
		case "-" :
			return CalcInterface.super.minus(nums);
		case "*" :
			return CalcInterface.super.multiply(nums);
		case "/" :
			return CalcInterface.super.divide(nums);
		case "%" :
			return CalcInterface.super.remain(nums);
		case "^" :
			return CalcInterface.super.square(nums);
		case "r" :
			return CalcInterface.super.root(nums);
		default:
			return 0;
		}
	}
}