class Member {
	private int memberId;
	private String name;
	private String password = "未設定";

	public Member(int id, String n) {
		memberId = id;
		name = n;
		password = "未設定";
	}

	public int getMemberId() {
		return memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public void setPassword(String pw) {
		if (pw.length() >= 4) {
			password = pw;
		}
	}

	public void showPublicInfo() {
		System.out.println("会員ID：" + memberId + "名前：" + name);
	}
	
	public void showPasswordStatus() {
		if(password.equals("未設定")) {
			System.out.println("パスワード：未設定");
		}else {
			System.out.println("パスワード：設定済み");
		}
	}
}

public class MemberApp {
	public static void main(String[] args) {
		Member mem1 = new Member(1001, "Taro");
		Member mem2 = new Member(1002, "Hanako");
		
//		mem1.memberId = 9999;
//		mem1.setMemberId = 9999;
		mem1.showPublicInfo();
		mem2.showPublicInfo();
		
		mem1.showPasswordStatus();
		mem2.showPasswordStatus();
		mem2.setPassword("paiza"); //mem2にパスワード設定したとき。

		mem2.showPublicInfo();
		mem2.showPasswordStatus();
	}
}
