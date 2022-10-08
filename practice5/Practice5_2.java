package practice5;

// super 클래스의 멤버필드를 사용할때 this() 사용 가능.
// 자바도 printf 사용 가능하다.

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public Person() {};
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person {
	public Student() {};
	
	public void setPerson(int weight, int age, int height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
		
		setWeight(weight);
		
	}
	
	public void showPerson() {
		System.out.printf("%d, %d, %d, %s", getWeight(), age, height, name);
	}
}

public class Practice5_2 {
	public static void main(String[] args) {
		Student mino = new Student();
		mino.setPerson(65, 22, 175, "미노 ");
		mino.showPerson();
	}
}
