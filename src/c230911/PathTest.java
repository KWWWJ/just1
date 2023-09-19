package c230911;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void test() {
		
		Path path = Paths.get("src/c230911/../c230908");
		System.out.println(path.toAbsolutePath().normalize()); //최종적인 경로 출력
		//용도 : 운영체제에 따라 다른 폴더의 위치를 나타내는 방법으로 인해 오류가 일어나지않도록 자동 변환해주는 친구
		
		File file = new File(path.toString()+"\\Main1.java");
		System.out.println(file.exists());
		
		try {
//			file.createNewFile();
			file.mkdir(); //위에서 파일을 따로 만들도록 되어있지 않을 떄, 그 이름을 가진 폴더를 생성해준다.
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}