package homework;
import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;
	
	public int average() {
		return (math + science + english) / 3;
	}
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
}

public class practice2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		
		Grade me = new Grade(math, science, english);
		
		System.out.print("평균은 " + me.average());
		
		s.close();
	}

}
