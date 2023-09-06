package c230829.calculator;

public interface AddInterface {
	default double add(double num1, double num2) {
		return num1+num2;
	}

}
