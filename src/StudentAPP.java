class Student0{
	String name;
	int grade;
	
	 Student0(String n, int g) {
		name = n;
		grade = g;
	}
	
	  void showInfo() {
		System.out.println(name + "さんは" + grade + "年生です");
	}
}

 class StudentAPP {
public static void main(String[] args) {
	
	Student0 s1 = new Student0("太郎", 2);
	Student0 s2 = new Student0("花子", 3);
	Student0 s3 = new Student0("次郎", 1);
	
	s1.showInfo();
	s2.showInfo();
	s3.showInfo();
	
}
}
