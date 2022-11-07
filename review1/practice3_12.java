package review1;

public class practice3_12 {
	
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < 4; i++) {
			temp[i] = i + 1;
		}
		return temp;
	}
	
	public static void main(String args[]) {
		int[] intArray = makeArray();
		for (int i = 0; i < 4; i++) {
			System.out.println(intArray[i]);
		}
	}
}
