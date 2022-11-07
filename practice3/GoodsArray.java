package practice3;

import java.util.Scanner;
import java.util.Vector;

class Goods {
	private String name;
	private int price;
	private int numberOfStock;

	Goods(String name, int price, int numberOfStock) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
	}
	
	void setNumberOfStock() {
		numberOfStock--;
	}
	
	void plusNumberOfStock(int n) {
		numberOfStock += n;
	}

	String getName() {return name;} 
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
}


public class GoodsArray {
	
	public static Vector<Goods> v = new Vector<Goods>();
	
	public static void manageGoods(int type) {
		Scanner sc = new Scanner(System.in);
		
		switch(type) {
		case 1:
			int choiceGoods = 0;
			int[] choiceGoodsCount = new int[100]; 
			int sum = 0;
			int money = 0;
			
			while (choiceGoods != (v.size() + 1)) {
				for (int i = 0; i < v.size(); i++) {
					System.out.print((i + 1) + ") " + v.get(i).getName() + "  ");
				}
				System.out.println((v.size() + 1) + ") 계산");
				
				choiceGoods = sc.nextInt() - 1;
				if (choiceGoods < v.size()) {
					if (v.get(choiceGoods).getNumberOfStock() > 0) {
						v.get(choiceGoods).setNumberOfStock();
						choiceGoodsCount[choiceGoods]++;
					}
					else
						return;
					
					sum += v.get(choiceGoods).getPrice();
					
				}
				else {
					break;
				}
			}
			
			System.out.println("판매 가격총액 : " + sum);
			System.out.print("받은 금액을 입력하시오 >> ");
			money = sc.nextInt();
			
			System.out.println("###     영수증     ####");
			System.out.println("=======================");
			for (int i = 0; i < v.size(); i++) {
				if (choiceGoodsCount[i] != 0) {
					System.out.println(v.get(i).getName() + "  " + v.get(i).getPrice() + "x" + choiceGoodsCount[i] + "  " + 
									v.get(i).getPrice() * choiceGoodsCount[i]);
				}
			}
			
			System.out.println("=======================");
			System.out.println("총액        " + sum);
			System.out.println("받은금액     " + money);
			System.out.println("=======================");
			System.out.println("거스름돈     " + (money - sum));
			
			break;
			
		case 2:
			int choiceGoods2 = 0;
			int quantity = 0;
			
			while (choiceGoods2 != (v.size())) {
				for (int i = 0; i < v.size(); i++) {
					System.out.print((i + 1) + ") " + v.get(i).getName() + "  ");
				}
				System.out.println((v.size() + 1) + ") 구매 종료 ");
				
				choiceGoods2 = sc.nextInt() - 1;
				
				if (choiceGoods2 < v.size()) {
					System.out.print("구매 수량을 입력하시오 >> ");
					quantity = sc.nextInt();
					
					v.get(choiceGoods2).plusNumberOfStock(quantity);
					
					System.out.println(v.get(choiceGoods2).getName() + " 의 재고량이 " + v.get(choiceGoods2).getNumberOfStock() + 
										"으로 증가함 ");
				}
				
			}
			
			break;
		
		case 3:
			System.out.println("###     상품별 재고량     ####");
			System.out.println("==============================");
			for (int i = 0; i < v.size(); i++) {
				System.out.println(v.get(i).getName() + "   " + v.get(i).getNumberOfStock());
			}
			System.out.println("==============================");
			break;
	
		case 4:
			sc.close();
			break;
		}
			
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int choice = 0;
		
		System.out.print("슈퍼에서 취급하는 상품의 개수를 입력하시오 >> ");
		count = s.nextInt();
		
		
		for(int i=0; i < count; i++) {
			System.out.print(i+1 + "번째 상품의 이름, 가격, 재고량을 입력하시오 >> ");
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			v.add(new Goods(name, price, n));
		}
		
		
		
		while (choice != 4) {
			
			System.out.println("1) 판매  2) 구매  3) 조회  4) 종료 ");
			choice = s.nextInt();
			
			if(choice != 4)
				manageGoods(choice);
			
		}
		
		System.out.println("프로그램 종료");
		
		s.close();
		
		return;
	}
}