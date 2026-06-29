import java.util.Random;
public class DiceRollSimulator {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int num = Integer.parseInt(args[0]);
		int[] count = new int [6];
		
		
		System.out.println("サイコロを" + num + "回振りました");
		
		for(int i = 0; i < num;i++) {
			
			int number = rand.nextInt(6) + 1;
	
			switch(number) {
			case 1:
				count[0]++ ;
				break;
			case 2:
				count[1]++;
				break;
			case 3:
				count[2]++;
				break;
			case 4:
				count[3]++;
				break;
			case 5:
				count[4]++;
				break;
			case 6:
				count[5]++;
				break;
		
			}
		}

		for(int i = 0; i < 6;i++) {
			
			double Parsent = (double)count[i] / num * 100;
			double resert = Math.round(Parsent * 100.0) / 100.0;
			
			System.out.println((i+1) + "の目：" + count[i] + "回 (" + resert + "%)");
		}
	}

}