package eg1;

import java.util.Arrays;

public class ChallengeArrayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {11,13,14,25,33,67,11,91,21};
		int n=3;
		clearDupAndHighest(array,n);
		
		
		
	}
	public static void clearDupAndHighest(int[] array ,int n) {
		Arrays.sort(array);
		int[] a = new int[array.length];
		int counter=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				a[counter]=array[i];
				counter++;
			}
		
		}
		a[counter] = array[array.length-1];
		for(int i=0;i<=counter;i++) {
			
			System.out.println(a[i]);
			System.out.println(a[n-1]);
		}
		
		
	
	}
	

}
