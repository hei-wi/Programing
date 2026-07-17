class Prod {
	String name;
	int price;
	String category;

	public Prod(String n, int p, String c) {
		name = n;
		price = p;
		category = c;
	}

	void showTask() {
		System.out.println(name + " / 価格：" + price + "円 / 分類：" + category);
	}
}

public class ProdApp {
	public static void main(String[] args) {
		Prod p1 = new Prod("ノート", 120,"文房具");
		Prod p2 = new Prod("チョコレート", 150,"お菓子");
		Prod p3 = new Prod("ボールペン", 200,"文房具");
		
		p1.showTask();
		p2.showTask();
		p3.showTask();
	}
}
