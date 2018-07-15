
public class PrimeNumber {

	public static void main(String[] args) {
		// 2,3,5,7,11,13
		int n =30;
		int num=0;
		String primeNbr="";
		for(int i =2;i<30;i++) {
			int counter = 0;
			for(num=i;num>=1;num--) {
				System.out.println("num is" +num);
				if(i%num==0) {
					System.out.println(num+" "  +i);
					counter=counter+1;
				}
			}
			if(counter ==2) {
				System.out.println("i is " +i);
				primeNbr = primeNbr + i +" ";
			}
			
		}
		System.out.println("Prime Numbers are" +primeNbr );

	}

}
