package c230908.stream;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}
	
	@Override
	public int hashCode() {
		return name.hashCode(); //이름으로 중복검사
	}
	@Override
	public String toString() {
		return name+" : "+ score;
	}
	@Override
	public boolean equals(Object s) {
		if(name != ((Student)s).getName())return false;
		return true;
	}
	@Override
	public int compareTo(Student s) { //이거 하려면 Comparable<Student> 상속받아야함
		return score - s.getScore();
	}
}
