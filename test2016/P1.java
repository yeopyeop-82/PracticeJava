package test2016;

class P1_Numbers {
	private int i;
	private int result;
	
	public P1_Numbers() {
		i = 0;
		result = 0;
	}
	
	public void printSum(int from, int to) {
		i = from;
		while (i <= to) {
			result += i;
			i++;
		}
		System.out.println(from + "부터 " + to + "까지의 합계 : " + result);
	}
}

public class P1 {
	public static void main(String[] args) {
		P1_Numbers p = new P1_Numbers();
		p.printSum(1, 4);
	}
}
