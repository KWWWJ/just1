package myPack;

public class Variable01 {

	public static void main(String[] agrs) {
	
	
		//TypeCasting(형변환)
		//대입연산자를 중심으로 왼쪽과 오른쪽 자료형을 일치시켜야할때가 있음
		
		   
		    
		    double num = 58.2;
		    
		    //(타입) 피연산자
		    int score = (int)num;
		    System.out.println(score);
		    System.out.println(num);
		    
		    @SuppressWarnings("unused")
			float value = (int)5.3;
		    @SuppressWarnings("unused")
			float value2 = (float)5.8;
		    @SuppressWarnings("unused")
			float value3 = 5.8f;
		    
		    
		    
		    int charTypeCasting = 65;
		    char intTypeCasting = 65;
		    int intTofloat = 10;
		    
		    
		    System.out.println(intTypeCasting);
		    System.out.println((char)charTypeCasting);
		    System.out.println((float)intTofloat);
		    System.out.println((float)charTypeCasting);
		
		   
	
	}
	
}
