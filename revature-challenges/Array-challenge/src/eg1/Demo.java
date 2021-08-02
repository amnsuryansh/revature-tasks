package eg1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,12,88,76,121,44};
		
		for(int i=0;i<arr.length;i++) {
			String s = arr[i]+"";
			if(s.charAt(0) == s.charAt(s.length()-1)) {
				s="";
				arr[i] = 0;
			}
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		String b = Arrays.toString(arr);
		System.out.println(b);
		String a = b.replaceAll("\\[","");
	
		String array[] = a.trim().split(",");
		
		StringBuilder s = new StringBuilder();
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		
		
	}

}
