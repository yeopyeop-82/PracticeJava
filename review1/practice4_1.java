package review1;

class Circle {
	private int r;
	private String name;
	
	public Circle(int r, String name) {
		this.r = r;
		this.name = name;
	}
	
	public Circle() {}
	
	public double circleArea() {
		return r * r * 3.14;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRadius() {
		return r;
	}
	
	
}

public class practice4_1 {
	public static void main() {
		Circle c1 = new Circle(6, "자바피자");
		Circle c2 = new Circle(5, "자바도넛");
		
		System.out.println(c1.getName() + "의 면적은 " + c1.circleArea());
		System.out.println(c2.getName() + "의 면적은 " + c2.circleArea());
		
	}

}
