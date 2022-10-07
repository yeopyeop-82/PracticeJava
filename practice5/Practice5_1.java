package practice5;

class Point {
	private int x, y;
	
	public Point() {};
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {};
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class Practice5_1 {
	public static void main(String[] args) {
		Point p = new Point();
		p.setPoint(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.setPoint(3, 4);
		cp.setColor("Blue");
		cp.showColorPoint();
		
	}
}
