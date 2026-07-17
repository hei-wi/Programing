class Studentn{
	String name;
	int grade;
	
	 Studentn(String n, int g) {
		name = n;
		grade = g;
	}
	
	void showTask() {
		System.out.println(name + "さんは" + grade + "年生です");
	}
	
}

public class StudentAP {
	public static void main(String[] args) {
		
	
	Studentn s1 = new Studentn("太郎",2);
	Studentn s2 = new Studentn("太郎",2);
	Studentn s3 = new Studentn("次郎", 3);
	
	s1.showTask();
	s2.showTask();
	s3.showTask();
	}
}
