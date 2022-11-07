package review1;

class temp {
	static int b = 5;
	static int c = 3;
	
}

public class P10 {
	static int a = 5;
	public static void main(String[] args) {
		a += 10;
		temp.b += 10;
		System.out.println(a);
		int a = 5;
		a += 1;
		System.out.println(a);
	}
}
