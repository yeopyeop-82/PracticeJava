package review1;
import java.util.Scanner;

class Circle {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
}

public class Practice4_6 {
	public static void main(String[] args) {
		Circle c[] = new Circle[5];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			c[i] = new Circle(s.nextInt());
		}
		
		s.close();
		
		for (int j = 0; j < 5; j++) {
			System.out.println(c[j].getArea());
		}
		
	}

}
