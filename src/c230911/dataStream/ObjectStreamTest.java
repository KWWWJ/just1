package c230911.dataStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
	public static void test() {
		try {
			String path = DataStreamTest.class.getResource("").getPath() + "test.txt";
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new  ObjectOutputStream(fos);
			
			Student s1= new Student(1, "아무개1", 90);
			Student s2= new Student(2, "아무개2", 93);
			Student s3= new Student(3, "아무개3", 100);
			
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			
			oos.flush();
			oos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new  ObjectInputStream(fis);
			
			Student sr1 = (Student) ois.readObject();
			System.out.println(sr1.num);
			System.out.println(sr1.name);
			System.out.println(sr1.score);
			
			Student sr2 = (Student) ois.readObject();
			System.out.println(sr2.num);
			System.out.println(sr2.name);
			System.out.println(sr2.score);
			
			Student sr3 = (Student) ois.readObject();
			System.out.println(sr3.num);
			System.out.println(sr3.name);
			System.out.println(sr3.score);
			
			ois.close();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
