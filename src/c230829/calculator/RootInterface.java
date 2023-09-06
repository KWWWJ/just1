package c230829.calculator;

public interface RootInterface {
	default double root(double num1) {
		return Math.sqrt(num1);
	}
}
