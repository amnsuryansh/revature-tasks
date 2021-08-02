package eg1;

import java.util.Scanner;

public class ChallengeArrayTwo {

	public static void main(String[] args) {
		
		
		int[] arr = {12,123,131,145,4556,78987,99};
		for(int i=0;i<arr.length;i++) {
			isPalindrome(arr[i]);
		}
		

	}
	public static void isPalindrome(int n) {
		String s = n + "";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String s1 = sb.toString();
		if(s.equals(s1)) {
			System.out.println(n);
		}
		
			
	}

}
