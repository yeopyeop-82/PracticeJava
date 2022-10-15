package rollDie;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

//상명대힉교 컴퓨터과학과 201910934 김승엽 

class Die {
	private int dieNum;
	
	public Die() {}
	
	public int roll() {
		Random random = new Random();
		dieNum = (random.nextInt(6)) + 1;
		return dieNum;
	}
	
}

class Player{
	private String name;
	private int wins;
	private int defeats;
	private int dice1;
	private int dice2;
	
	public Player () {
		wins = 0;
		defeats = 0;
		dice1 = 0;
		dice2 = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWins() {
		wins++;
	}
	
	public void setDefeats() {
		defeats++;
	}
	
	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}
	
	public void setDice2(int dice2) {
		this.dice2 = dice2;
	}
	
	public String returnName() {
		return name;
	}
	
	public int returnWins() {
		return wins;
	}
	
	public int returnDefeats() {
		return defeats;
	}
	
	public int returnDice1() {
		return dice1;
	}
	
	public int returnDice2() {
		return dice2;
	}
	
	public int returnSum() {
		return dice1 + dice2;
	}
	
	
}

class gameManager {
	private int biggest;
	private int winPlayer[] = new int[6];
	private int reset[] = new int[6];
	
	public gameManager() {
		biggest = 0;
	}
	
	public void setBiggest(int sum, int i) {
		if (sum > biggest) {
			biggest = sum;
			winPlayer = Arrays.copyOf(reset, 6);
			winPlayer[i] = 1;
		}
		else if (sum == biggest) {
			winPlayer[i] = 1;
		}
	}
	
	public int[] wins() {
		return winPlayer;
	}
	
}

public class roll_die {
	public static void main(String[] args) {
		int participants = 0;
		int gameCount = 0;
		int ifRoll = 0;
		String continueGame = "y";
		
		Scanner s = new Scanner(System.in);
		
		Player players[] = new Player[6];
		Die die = new Die();
		
		System.out.println("게임 참가자의 수를 입력하시오.");
		participants = s.nextInt();
		
		System.out.println("게임 참가자의 이름을 차례로 입력하시오. ");
		
		for (int i = 0; i < participants; i++) {
			System.out.println(i+1 + "번째 참가자 이름 입력 : ");
			players[i] = new Player();
			players[i].setName(s.next());
		}
		
		System.out.println("*** 지금부터 게임을 시작합니다. ***");
		
		while (continueGame.equals("y")) {
			System.out.println("Game #" + ++gameCount);
			
			gameManager gm = new gameManager();
			
			for (int i = 0; i < participants; i++) {
				System.out.println(players[i].returnName() + "차례입니다. 주사위를 던지려면 1을 입력하세요."); 
				ifRoll = s.nextInt();
				if (ifRoll == 1) {
					players[i].setDice1(die.roll());
					players[i].setDice2(die.roll());
				}
				else {
					return;
				}
				System.out.printf("%s : 첫번째 주사위 %d  두번째 주사위 %d  두 주사위의 합 : %d \n", 
						players[i].returnName(), players[i].returnDice1(), players[i].returnDice2(), players[i].returnSum());
				
				gm.setBiggest(players[i].returnSum(), i);
				
			}
			
			int winPlayers[] = new int[6];
			winPlayers = gm.wins();
			System.out.print("이번 게임의 승자는 ");
			
			for (int i = 0; i < participants; i++) {
				if (winPlayers[i] == 1) {
					players[i].setWins();
					System.out.print(players[i].returnName() + " ");
				}
				else {
					players[i].setDefeats();
				}
			}
			
			System.out.println("입니다.");
			
			System.out.println("게임을 계속 하시겠습니까? (y/n)");
			continueGame = s.next();
			
		}
		
		System.out.println("게임이 종료되었습니다.");
		System.out.printf("전체 %d 게임 중 \n",gameCount);
		for (int i = 0; i < participants; i++) {
			System.out.printf("%s : %d 승 %d 패 \n", 
					players[i].returnName(), players[i].returnWins(), players[i].returnDefeats());
		}
		s.close();
		
	}
}
