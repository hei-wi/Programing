class Account {
	String username;
	String password;
	String status;

	void showTask() {

		System.out.println("ユーザー名：" + username + " / 状態：" + status
				+ " / パスワード文字数：" + password.length() + "文字");

	}

	public Account(String name) {
		username = name;
		password = "temp1234";
		status = "仮登録";
		System.out.println("[INFO]" + name + "さんの仮登録を作成しました。");
	}

	public Account(String name, String pass, String confirm) {
		username = name;
		if (!pass.equals(confirm)) {
			System.out.println("[NG]パスワードが一致しません");
			password = "temp1234";
			status = "エラー（パスワードの不一致）";
			
			return;
		} 
		
		if (pass.length() < 6) {
			System.out.println("[NG]パスワードが短すぎます（６文字以上）。仮登録に切り替えます。");
			password = "temp1234";
			status = "エラー（短すぎ）";
			
			return;
		} 
		
		if (pass.equals(confirm)) {
			if (pass.length() >= 6) {
				password = pass;
				status = "登録済み";
				System.out.println("[OK]登録が完了しました。");
			}
		}

	}
}

public class AccountApp {
	public static void main(String[] args) {
		Account ac1 = new Account("taro");
		Account ac2 = new Account("hanako", "abc", "abc");
		Account ac3 = new Account("jiro", "secret1", "sercret1");
		Account ac4 = new Account("mika", "pass123", "pass124");

		ac1.showTask();
		ac2.showTask();
		ac3.showTask();
		ac4.showTask();
	}
}
