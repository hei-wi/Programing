import java.util.Scanner;
public class JavaKeywordSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int total = 0;
		
		String[] keywords = {
			    "abstract", "assert", "boolean", "break", "byte",
			    "case", "catch", "char", "class", "const", 
			    "continue", "default", "do", "double", "else", 
			    "enum", "extends", "final", "finally", "float", 
			    "for", "goto", "if", "implements", "import", 
			    "instanceof", "int", "interface", "long", "native", 
			    "new", "package", "private", "protected", "public", 
			    "return", "short", "static", "strictfp", "super", 
			    "switch", "synchronized", "this", "throw", "throws", 
			    "transient", "try", "void", "volatile", "while"
			};
		
		System.out.println("検索方法を選んでください");
		System.out.println("１：文字数で検索");
		System.out.println("２：頭文字で検索");
		System.out.println("番号：");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("何文字の予約語を検索しますか：");
			int word = sc.nextInt();
			System.out.println(word + "文字の予約語を表示します");
			
			for(int i = 0; i < keywords.length ; i++) {
				if(word == keywords[i].length()) {
					System.out.println(keywords[i]);
					count++;
				}
			}
			System.out.println("一致した予約語：" + count + "個");
			
		}else if (num == 2) {
			System.out.println("頭文字を入力してください");
			String hed  = sc.next();
			char key = hed.charAt(0);
			System.out.println("「" + hed + "」から始まる予約語を表示します");
			
			for(int i = 0; i < keywords.length ; i++) {
				char charA = keywords[i].charAt(0);
				if(key  == charA) {
					System.out.println(keywords[i]);
					total++;
				}
		}
			System.out.println("一致した予約語：" + total + "個");
	}
		sc.close();
}
}
