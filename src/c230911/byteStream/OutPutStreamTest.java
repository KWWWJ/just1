package c230911.byteStream;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutPutStreamTest {
	// 통신이란 뭘까?
	//	- 데이터를 주고받는 것
	// 	- 어떤 상황인가? 
	//  	=> 데이터를 보내고 받을 때(자신 이외의 모든 기기 혹은 네트워크와 연결되어있는 것)
	//		일반적으로 생각해볼 수 있는 통신.
	
	//		=> 키보드 입력시 데이터가 메인보드를 통해 CPU에 전달된다.
	//		프로그램상에서 생각해야할 세부적인 부분.
	public static void test() {
		String path = "C:/Users/KGA/eclipse-workspace/Education02/src/c230911/byteStream/test.db";
		//window외 나머지
		try {
			OutputStream os = new FileOutputStream(path); //
			
			os.write(10);
			os.write(20);
			os.write(30);
			
			os.flush();//메모리가 가득차지 않았어도 강제로 파일로 저장한다. HDD와 통신한다.
			os.close(); //stream을 열었으면 항상 닫아줘야한다
			
			InputStream is = new FileInputStream(path);
//			System.out.println(is.read());
//			System.out.println(is.read());
//			System.out.println(is.read());
//			System.out.println(is.read());
			
			while(true) {
				int data = is.read();
				if(data == -1)break;
				System.out.println("data : "+data);
			}
			
			is.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		try {
			OutputStream os = new FileOutputStream(path); //
			
			byte[] arr = {10, 20, 30};
			os.write(arr);
			
			os.flush();
			os.close();
			
			os.close();
			
			InputStream is = new FileInputStream(path);
			
			byte[] arr1 = new byte[100];
			
			int count = is.read(arr1);
			
			for(int i=0; i<count; i++) {
				System.out.println("arr1["+i+"] : "+arr1[i]);
				//"가" UTF-8 상에서 3byte (FF FF FF) = AC00
			}
			
			is.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
