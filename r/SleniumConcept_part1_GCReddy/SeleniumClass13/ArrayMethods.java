package SeleniumClass13;

import java.awt.List;
import java.util.Arrays;

public class ArrayMethods {
	
	public static void main(String[] args) {
		
		
		int y [];
		
		int y1 []= new int[4];
		System.out.println(y1.getClass().getName());
		
		
		
		// length of array - return the size of array
		int [] a = {2,56,7,8};
		
		
		
		System.out.println(a.length); // 4
		
		// to string method
		
		String [] b = {"uft", "rtf"};
		String [] r = {"uft", "rtf","Selenium","Dog"};
		int [] m = {4,5,6,7,8};
		
		
		int [] d = {4,5,6,3};
		
		System.out.println(d);
		String c = Arrays.toString(b);
		System.out.println(c);
		
		String e = Arrays.toString(d);
		System.out.println(e);
		
		
		//Conatin() method -> 
		//For example there is an String of array with "UFT","Cat","Dog". Bow you want to verfiy a particular word in your array is present.
		//Then you will use the method contain() to verify it. 
		//In parameter of contian you will passed the Actual value you want to verify.
		//Return type is boolean i.e if a value is present in array then , it will return true otherwise false.
		
		boolean n = Arrays.asList(b).contains("uft");
		System.out.println(n);  // true
		
		boolean t = Arrays.asList(r).contains("Cat");
		System.out.println(t);  // false
		
		boolean u = Arrays.asList(m).contains(9);
		System.out.println(u);  // false
		
		
	
		
	}

}
