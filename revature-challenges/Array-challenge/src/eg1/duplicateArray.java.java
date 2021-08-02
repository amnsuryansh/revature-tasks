package eg1;

import java.util.Arrays;

public class ChallengeArray {

	public static void main(String[] args) {
		int[] array = {10,18,14,10,19,23,23}; 
		clearDup(array);
	}
	public static void clearDup(int[] array) {
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
		}
		
	
	}

}
