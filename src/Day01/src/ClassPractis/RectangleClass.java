package ClassPractis;

class Rectangle
{
	int height;
	int width;
	int plus;
	int stack;
	
	Rectangle(int height, int width)
	{
		this.height=height;
		this.width=width;
		this.plus=(height*2)+(width*2);
		this.stack=height*width;
	}
}

public class RectangleClass {
	public static void main(String[] agrs)
	{
		//Rectangle Class만들기
				//사각형은 가로와 세로 길이를 지닌다.
				//면적과 둘래를 계산하는 메서드가 포함되어야 함.
				//결과 출력
		Rectangle rectangle=new Rectangle(2, 5);
		System.out.println("높이"+rectangle.height+"\n"+"밑변"+rectangle.width);
		System.out.println("넓이 : "+rectangle.stack+"\n"+"둘래 : "+rectangle.plus);
	}

}
