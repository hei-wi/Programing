class Student{
	String name;
	int score1;
	int score2;
	int score3;
	String subject1 = "国語";
	String subject2 = "数学";
	String subject3 = "英語";
	
}

class Exp65_challenge1 {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		Student st5 = new Student();
		
		st1.name = "今永";
		st1.score1 = 78;
		st1.score2 = 84;
		st1.score3 = 72;
		
		st2.name = "大谷";
		st2.score1 = 66;
		st2.score2 = 69;
		st2.score3 = 81;
		
		st3.name = "岡本";
		st3.score1 = 92;
		st3.score2 = 88;
		st3.score3 = 90;
		
		st4.name = "佐々木";
		st4.score1 = 55;
		st4.score2 = 64;
		st4.score3 = 70;
		
		st5.name = "山本";
		st5.score1 = 84;
		st5.score2 = 75;
		st5.score3 = 72;
		
		System.out.println("名前：" + st1.name);
		System.out.println(st1.subject1 + "：" + st1.score1);
		System.out.println(st1.subject2 + "：" + st1.score2);
		System.out.println(st1.subject3 + "：" + st1.score3);
		System.out.println("平均点："
		+ (double)(st1.score1 + st1.score2 + st1.score3) / 3 + "点");
		
		System.out.println();
		
		System.out.println("名前：" + st2.name);
		System.out.println(st2.subject1 + "：" + st2.score1);
		System.out.println(st2.subject2 + "：" + st2.score2);
		System.out.println(st2.subject3 + "：" + st2.score3);
		System.out.println("平均点：" 
		+ (double)(st2.score1 + st2.score2 + st2.score3) / 3 + "点");
		
		System.out.println();
		
		System.out.println("名前：" + st3.name);
		System.out.println(st3.subject1 + "：" + st3.score1);
		System.out.println(st3.subject2 + "：" + st3.score2);
		System.out.println(st3.subject3 + "：" + st3.score3);
		System.out.println("平均点：" 
		+ (double)(st3.score1 + st3.score2 + st3.score3) / 3 + "点");
		
		System.out.println();
		
		System.out.println("名前：" + st4.name);
		System.out.println(st4.subject1 + "：" + st4.score1);
		System.out.println(st4.subject2 + "：" + st4.score2);
		System.out.println(st4.subject3 + "：" + st4.score3);
		System.out.println("平均点：" 
		+ (double)(st4.score1 + st4.score2 + st4.score3) / 3 + "点");
		
		System.out.println();
		
		System.out.println("名前：" + st5.name);
		System.out.println(st5.subject1 + "：" + st5.score1);
		System.out.println(st5.subject2 + "：" + st5.score2);
		System.out.println(st5.subject3 + "：" + st5.score3);
		System.out.println("平均点：" 
		+ (double)(st5.score1 + st5.score2 + st5.score3) /3 + "点");
		
	}
}
