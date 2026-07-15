class ProductAp{
	String name;
	int price;
	String category;
	
	public ProductAp(String n,int p,String c) {
		name = n;
		price = p;
		category = c;
	}
	
	void show() {
		System.out.println("商品名：" + name + " / 価格：" + price + "円 / 分類：" + category);
	}
}

public class Product {
public static void main(String[] args) {
	ProductAp p1 = new ProductAp("ノート",120,"文房具");
	ProductAp p2 = new ProductAp("チョコレート",150,"お菓子");
	ProductAp p3 = new ProductAp("ボールペン",200,"文房具");
	
	p1.show();
	p2.show();
	p3.show();
}
}
