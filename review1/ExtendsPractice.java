package review1;

class PenInfo {
	private int amount;
	private String color;
	public int getAmount() { return amount; }
    public void setAmount (int amount) { this.amount = amount; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}

class SharpPencil extends PenInfo { // 샤프펜슬
	 private int width; // 펜의 굵기
}

class Ballpen extends PenInfo {}

class FountainPen extends PenInfo { // 만년필
     public void refill (int n) { setAmount(n); }
}

public class ExtendsPractice {

}
