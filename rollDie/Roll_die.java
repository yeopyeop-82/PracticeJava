package rollDie;
import java.util.Scanner;
import java.util.Random;

class Dice {
	private int dice[] = new int[2];
	Random r = new Random();
	
	public Dice() {
		dice[0] = r.nextInt(5) + 1;
		dice[1] = r.nextInt(5) + 1;
	}
		
	public int getDice(int i) {
		return dice[i];
	}
	
	public int getDiceSum() {
		return dice[0] + dice[1];
	}
}

class Player {
	private String name;
	private int wins;
	private int defeats;
	private int result;
	
	public Player(String name) {
		this.name = name;
		wins = 0;
		defeats = 0;
	}
	
	public void setWins() {
		wins++;
	}
	
	public void setDefeats() {
		defeats++;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWins() {
		return wins;
	}
	
	public int getDefeats() {
		return defeats;
	}
	
	public int getResult() {
		return result;
	}
}

class GameManager {
	private int participants;
	private String name[] = new String[6];
	
	public GameManager() {};
	
	public void setParticipants() {
		System.out.println("게임 참가자의 수를 입력하시오. ");
		Scanner s = new Scanner(System.in);
		participants = s.nextInt();
		
		System.out.println("게임 참가자의 이름을 차례로 입력하시오. ");
		for (int i = 0; i < participants; i++) {
			System.out.println(i+1 + " 번째 참가자 이름 입력 : ");
			name[i] = s.next();
		}
		
		s.close();
	}
	
	public int getParticipants() {
		return participants;
	}
	
	public String getName(int i) {
		return name[i];
	}
}

public class Roll_die {
	public static void main(String[] args) {
		String gameContinue = "y";
		int gameCount = 1;
		int rollDice = 0;
		int biggest = 0;
		int winIndex = 0;
		Scanner scanner = new Scanner(System.in);
		
		GameManager g = new GameManager();
		g.setParticipants();
		
		Player p[] = new Player[6];
		for(int i = 0; i < g.getParticipants() ; i++) {
			p[i] = new Player(g.getName(i));
		} //객체배열 초기화 
		
		System.out.println("*** 지금부터 게임을 시작합니다. ***");
		
		while(gameContinue == "y") {
			System.out.println("Game #" + gameCount);
			for (int j = 0; j < g.getParticipants(); j++) {
				Dice d = new Dice();
				System.out.println(g.getName(j) + "차례입니다. 주사위를 던지려면 1을 입력하세요 ");
				rollDice = scanner.nextInt();
				if(rollDice == 1) {
					System.out.println(g.getName(j) + ": 첫번째 주사위 " + d.getDice(0) + "두 번째 주사위 " + d.getDice(1) + " 두 주사위의 합 : " + d.getDiceSum());
					p[j].setResult(d.getDiceSum());
				}
			}
			
			for (int i = 0; i < g.getParticipants(); i++) {
				if (biggest <= p[i].getResult()) {
					biggest = p[i].getResult();
					winIndex = i;
				}
			}
			
			System.out.println("이번 게임의 승자는 " + p[winIndex].getName() + " 입니다.");
			p[winIndex].setWins();
			
			
		}
		
	}

}
