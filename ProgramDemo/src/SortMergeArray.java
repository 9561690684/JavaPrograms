
public class SortMergeArray {

	public static void main(String[] args) {
		int []arr1 = {5,3,6,4};
		int []arr2 = {50,40,60,10};
		sortMergerArray(arr1,arr2);

	}

	private static void sortMergerArray(int[] arr1, int[] arr2) {
		int[] k =new int[arr1.length+arr2.length];
		int[] j=new int[arr1.length];
		int[] l=new int[arr1.length];
		int a=0,b=0;
		for(int i=0;i<arr1.length;i++) {
			j[i] = arr1[i];
			a++;
			b++;
		}
		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.print(k[i]);
//		}
//		
//		for(int i=a;i<arr2.length;i++) {
//			l[i] = arr2[a];
//		}
//		
		for(int i=0;i<k.length;i++) {
			k[i] = j[i];
			System.out.println(k[i]);
		}
		
		
	}

}
