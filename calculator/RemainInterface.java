package c230829.calculator;

public interface RemainInterface {
	default double remain(double num1, double num2) {
		return num1%num2;
	}
}
