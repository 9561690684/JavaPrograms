
public class NbrAddition {

	public static void main(String[] args) {

		int n = 12345;
		int a = n;
		int add = 0;
		while(a>0){
			int rem = n%10;
			
//			System.out.println(rem);
			add = rem + add;
			a = a*10 + add;
			n = n/10;
			
		}
		System.out.println(add);
	}

}
