package test2016;

class P2_Tour {
	public String cities[] = {"Seoul", "New York", "Sydney", "Tokyo", "Beijing"};
	
	public P2_Tour() {};
	
	public void printCities() {
		for (String city : cities) {
			System.out.println(city);
		}
	}
}

public class P2 {
	public static void main(String[] args) {
		P2_Tour p2 = new P2_Tour();
		p2.printCities();
	}
}