package c230911.dataStream;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static final long  serialVersionUID = 1234567;
	int num;
	String name;
	double score;
	
	Student(int num, String name, double score){
		this.num = num;
		this.name = name;
		this.score = score;
	}

}
