package c230829.calculator;

public interface CalcInterface extends
	AddInterface,
	MinusInterface,
	MultipiyInterface,
	DivideInterface,
	RemainInterface,
	SquareInterface,
	RootInterface {
	public default double add(double...nums) {//...num는 받은 변수를 일괄적으로 처리, nums는 배열
		double temp=0;
		for(double num : nums) {
			temp = AddInterface.super.add(temp, num);
		}
		return temp;
	}
	
	public default double minus(double...nums) {
		double temp= nums[0];
		for(int i=1; i<nums.length; i++) {
			temp = MinusInterface.super.minus(temp, nums[i]);
		}
		return temp;
	}
	public default double multiply(double...nums) {
		double temp= nums[0];
		for(int i=1; i<nums.length; i++) {
			temp = MultipiyInterface.super.multiply(temp, nums[i]);
		}
		return temp;
	}
	public default double divide(double...nums) {
		double temp= nums[0];
		for(int i=1; i<nums.length; i++) {
			temp = DivideInterface.super.divide(temp, nums[i]);
		}
		return temp;
	}
	public default double remain(double...nums) {
		double temp= nums[0];
		for(int i=1; i<nums.length; i++) {
			temp = RemainInterface.super.remain(temp, nums[i]);
		}
		return temp;
	}
	public default double square(double...nums) {
		double temp= nums[0];
		for(int i=1; i<nums.length; i++) {
			temp = SquareInterface.super.square(temp, nums[i]);
		}
		return temp;
	}
	public default double root(double...nums) {
		double temp= nums[0];
		for(int i=1; i<nums.length; i++) {
			temp = RootInterface.super.root(temp);
		}
		return temp;
	}
}
