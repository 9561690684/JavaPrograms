import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Keshav";

		//By using StringBuffer or StringBuilder
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());
		
		//By using character array
//		char a[]= new char[7];
//		for(int i=0;i<s.length();i++) {
//			a[i]=s.charAt(i);
//		}
//		System.out.println(a);
//	
//	   String b = "Nitin";
//	   StringBuffer c = new StringBuffer("Nitin");
//	   System.out.println(b.hashCode());
//	   System.out.println(b.equals(c.toString()));
//	   System.out.println(c.hashCode());
	   
	   List<Integer> l = new ArrayList<Integer>();
	   l.add(5);
	   l.add(3);
	   l.add(5);
	   l.add(3);
	   l.add(6);
	   l.add(6);
	   
	   Comparator<Integer> c= new Comparator<Integer>() {
		   @Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
	};
	   l.sort(c);
	   System.out.println(l);
	}

}
