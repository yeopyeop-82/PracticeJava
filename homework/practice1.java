package homework;

class TV {
	private String name;
	private int year;
	private int size;
	
	public TV(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(name + "에서 만든 " + year + "년형 " + size +"인치 TV");
	}
}

public class practice1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
