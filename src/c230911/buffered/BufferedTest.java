package c230911.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedTest {
	public static void test() {
		try {
			
			System.out.println("buffered path");
			String path = BufferedTest.class.getResource("").getPath();
			System.out.println(path+"509262_348504_0008.jpg");
			FileInputStream fis = new FileInputStream(path+"509262_348504_0008.jpg");
			FileOutputStream fos = new FileOutputStream(path+"output1.jpg");
			
			FileInputStream fis2 = new FileInputStream(path+"509262_348504_0008.jpg");
			FileOutputStream fos2 = new FileOutputStream(path+"output1.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);
			System.out.println("time");
			System.out.println(copy(fis, fos));
			System.out.println(copy(bis, bos));
			fis.close();
			fos.close();
			bis.close();
			bos.close();
			fis2.close();
			fos2.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static long copy(InputStream is, OutputStream os) throws Exception { //시간
		long start = System.nanoTime();
		while(true) {
			int data = is.read();
			if(data == -1)break;
			os.write(data);
		}
		
		long end = System.nanoTime();
		return end - start;
	}
}
