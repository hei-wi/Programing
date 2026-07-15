
public class ScopeAll {
	int field = 200;
	int local = 200;
	int block = 0;
	void checkScope() {
		
		System.out.println("start: field=" + field + ", local=" + local);
		
		if(true) {
			 local = 300;
			 block = 400;
			System.out.println(local + block);
		}
		
		System.out.println(block);
		
		int temp = 0;
		int sub = 0;
		for(int j = 0; j < 2; j++) {
			 temp  = j*10;
			System.out.println("loop: j=" + j + ", temp=" + temp);
			sub = j;
		}
		
		System.out.println(sub);
		System.out.println(temp);
		
		int x = 1;
		{
			x = 2;
			System.out.println(x);
		}
	}
	
	void anotherMethod() {
		System.out.println(local);
		System.out.println(block);
		System.out.println("field=" + field);
	}
}
