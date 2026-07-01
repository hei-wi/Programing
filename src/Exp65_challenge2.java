class Student2{
	String name;
	int score1;
	int score2;
	int score3;
	
	void showDown() {
		System.out.print("名前：" + name);
		System.out.print(" 国語：" + score1 + "点");
		System.out.print(" 数学：" + score2 + "点");
		System.out.print(" 英語：" + score3 + "点");
	}
	
	void showAverrage() {
		System.out.println(" 平均点：" + getAverage() + "点");
	}
	double getAverage() {
		return (score1 + score2 + score3) / 3.0;
		
	}
}

class Exp65_challenge2 {
	public static void main(String[] args) {
		Student2 str1 = new Student2();
		Student2 str2 = new Student2();
		Student2 str3 = new Student2();
		Student2 str4 = new Student2();
		Student2 str5 = new Student2();
		
		
		str1.name = "今永";
		str1.score1 = 78;
		str1.score2 = 84;
		str1.score3 = 72;
		
		str2.name = "大谷";
		str2.score1 = 66;
		str2.score2 = 69;
		str2.score3 = 81;
		
		str3.name = "岡本";
		str3.score1 = 92;
		str3.score2 = 88;
		str3.score3 = 90;
		
		str4.name = "佐々木";
		str4.score1 = 55;
		str4.score2 = 64;
		str4.score3 = 70;
		
		str5.name = "山本";
		str5.score1 = 84;
		str5.score2 = 75;
		str5.score3 = 72;	
		
		str1.showDown();
		System.out.println();
		str1.showAverrage();
		System.out.println();
		
		str2.showDown();
		System.out.println();
		str2.showAverrage();
		System.out.println();
		
		str3.showDown();
		System.out.println();
		str3.showAverrage();
		System.out.println();
		
		str4.showDown();
		System.out.println();
		str4.showAverrage();
		System.out.println();
		
		str5.showDown();
		System.out.println();
		str5.showAverrage();
	}
}
