class Tak {
	String title;
	String dueDate;
	int priority;

	public Tak(String title, String dueDate, int priprity) {
		this.title = title;
		this.dueDate = dueDate;
		this.priority = priprity;
	}

	void showTak() {
		System.out.println("「" + title + "」" + "は期限：" + dueDate + "、優先度：" + priority);
	}
}

public class TaskManagerApp {
	public static void main(String[] args) {
		Tak t1 = new Tak("授業資料の作成","2025-10-16",3);
		Tak t2 = new Tak("大学祭の準備","2025-10-30",1);
		Tak t3 = new Tak("オープンキャンパスの準備","2025-10-25",2);
		
		t1.showTak();
		t2.showTak();
		t3.showTak();
	}
}
