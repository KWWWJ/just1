package c230911.fileIo;

import java.io.Writer;
import java.io.Reader;
import java.io.FileWriter;
import java.io.FileReader;


public class FileIoTest {
	public static void test() {
		String path = "C:\\Users\\KGA\\eclipse-workspace\\Education02\\src\\c230911\\fileIo\\test.txt";
		// window기준
		try {
			Writer writer = new FileWriter(path);
			
			
			writer.write('a');
			writer.write("가나다라");
			
			writer.flush();
			writer.close();
			
			Reader reader = new FileReader(path);
			
//			System.out.println((char)Reader.read());
			
			char[] arr = new char[10];
			int count = reader.read(arr);
			System.out.println();
			System.out.println(count+" : "+new String(arr, 0, count));
			
			reader.close();
		}catch(Exception e) {
			
		}
	}
}
