package review1;
import java.util.Scanner;

class Day {
	private String work;
	
	public Day() {}
	
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if (work == null) {
			System.out.println("없습니다. ");
		}
		else System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	private int day;
	private String todo;
	private Day days[] = new Day[31];
	
	public MonthSchedule() {
		day = 0;
		for (int i =0; i < days.length; i++) {
			days[i] = new Day();
		}
	}
	
	public void insert(int day, String todo) {
		days[day].set(todo);
	}
	
	public void show(int day) {
		System.out.println(day + "일의 할 일은 " + days[day].get() + "입니다.");
	}
	
}

public class P7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int instruction = 0;
		int day = 0;
		String work;
		MonthSchedule m = new MonthSchedule();
		
		System.out.println("이번달 스케줄 관리 프로그램입니다.");
		while(true) {
			System.out.print("\n할일 (입력 :1, 보기 : 2, 끝내기 : 3) >> ");
			instruction = s.nextInt();
			
			switch(instruction) {
			case 1:
				System.out.print("날짜(1~30) >> ");
				day = s.nextInt();
				System.out.print("할일 >> ");
				work = s.next();
				m.insert(day, work);
				break;
			case 2:
				System.out.print("날짜(1~30) >> ");
				day = s.nextInt();
				m.show(day);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				s.close();
				return;
			}
		}
	}
}
