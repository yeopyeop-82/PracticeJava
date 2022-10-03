package practice;
import java.util.Scanner;

public class practice4_2 {
	int width;
	int height;
	
	private int getArea() {
		return width * height;
	}
	
	public static void main(String args[]) {
		int w, h;
		System.out.print(">> ");
		Scanner s = new Scanner(System.in);
		w = s.nextInt();
		h = s.nextInt();
		
		practice4_2 rect = new practice4_2();
		rect.width = w;
		rect.height = h;
		
		System.out.println(rect.getArea());
		
		s.close();
		
	}
}
