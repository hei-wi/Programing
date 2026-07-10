public class selfIntroduce{
	public static void main(String[] args) {
		Main watashi = new Main();
		
		watashi.greet("まさる");
		watashi.greet("工藤", "勝");
		watashi.greet("工藤","勝","犬");
		
	}
}


class Main {
	void greet(String lastName) {
		System.out.println("私の名前は" + lastName + "です、よろしく");
	}
	
	void greet(String lastName,String firstName) {
		System.out.println("私の名前は" + lastName + firstName +"です、よろしく");
	}
	
	void greet(String lastName,String firtName,String shumi) {
		System.out.println("私の名前は" + lastName + firtName  +"、趣味は" +shumi +"です、よろしく");
	}
}
