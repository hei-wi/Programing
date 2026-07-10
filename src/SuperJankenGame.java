import java.util.Random;
import java.util.Scanner;

class Sample{
	
	void my() {
		System.out.println("じゃんけんの手を選んでください");
		System.out.println("０：グー");
		System.out.println("１：チョキ");
		System.out.println("２：パー");
		System.out.println("番号を入力：");
	}
	
	void Player(int player) {
		if (player == 0){
			System.out.println("あなたの手:グー");
		}else if(player == 1){
			System.out.println("あなたの手:チョキ");
		}else {
			System.out.println("あなたの手:パー");
		}
	}
	
	void CPU(int cpu) {
		if (cpu == 0){
			System.out.println("CPUの手:グー");
		}else if(cpu == 1){
			System.out.println("CPUの手:チョキ");
		}else {
			System.out.println("CPUの手:パー");
		}
	}
	
	
	void  resurt(int player,int cpu) {
		if((player == 0 && cpu == 0) ||
		           (player == 1 && cpu == 1) ||
		           (player == 2 && cpu == 2)){
				System.out.println("あいこ");
				System.out.println("もう一度じゃんけんをします");
				System.out.println();
				;
				
			}else if((player == 0 && cpu == 2) ||
			           (player == 1 && cpu == 0) ||
			           (player == 2 && cpu == 1)){
					System.out.println("CPUの勝ち");
					
			}else{
					System.out.println("あなたの勝ち");
					
			}
	}
}

public class SuperJankenGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Sample sam = new Sample();
		
		System.out.println("じゃんけんゲームを開始します");
		System.out.println();

		System.out.println("難易度を選んでください");
		System.out.println("１：めちゃ弱い");
		System.out.println("２：ふつう");
		System.out.println("３：メタ強い");
		System.out.println("番号を入力：");
		int num = sc.nextInt();
		
		int cpu = rand.nextInt(3);
		
		if(num == 1) {
			
			sam.CPU(cpu);
			System.out.println();
			
			sam.my();
			int player = sc.nextInt();
			System.out.println();
			
			sam.Player(player);
			sam.CPU(cpu);
			sam.resurt(player, cpu);
		
			
		}else if(num == 2) {
			while (true) {
			    sam.my();
			    int player = sc.nextInt();
			    System.out.println();
			    sam.Player(player);
			    sam.CPU(cpu);
			    sam.resurt(player, cpu);

			    if (player != cpu) {
			        break;
			    }
			}
			
			}else {
				sam.my();
				int player = sc.nextInt();
				
				if (player == 0){
					cpu = 2;
				}else if(player == 1){
					cpu = 0;
				}else {
					cpu = 1;
				}
				
				sam.Player(player);
				sam.CPU(cpu);
				sam.resurt(player, cpu);
				
			}
		
		System.out.println("ゲームを終了します");
		sc.close();
			}
		}

	

