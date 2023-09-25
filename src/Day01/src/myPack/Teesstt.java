package myPack;

public class Teesstt {

	public static void main(String[] args) { 
		int x = 2; 
		int y = 5; 
		char c = 'A'; // 'A'의 문자코드는 65 
		System.out.println(1 + x << 33); 
		System.out.println(y >= 5 || x < 0 && x > 2); 
		System.out.println(y += 10 - x++); 
		System.out.println(x+=2); 
		System.out.println( !('A' <= c && c <='Z') ); 
		System.out.println('C'-c); 
		System.out.println('5'-'0'); 
		System.out.println(c+1); 
		System.out.println(++c); 
		System.out.println(c++); 
		System.out.println(c); 
		
		
		
		int numOfApples = 123; // 사과의 개수 
		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0) ) ;

		System.out.println("필요한 바구니의 수 :"+numOfBucket);
	
	
	
	
	
	
	
	
	} 


	
	
	
	
	
}
