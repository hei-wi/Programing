class BankAccount {
	private String owner;
	private int deposit;

	public BankAccount(String o, int d) {
		owner = o;
		deposit = d;
	}

	public void showInfo() {
		System.out.println(owner + "さんの口座残高は" + deposit + "円です。");
	}
}

public class BankApp {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount("山田太郎",50000);
		
//		System.out.println(bank.owner);
//		System.out.println(bank.deposit);
		
		bank.showInfo();
	}
}
