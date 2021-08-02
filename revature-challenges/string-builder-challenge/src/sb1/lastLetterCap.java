package sb1;

import java.util.Scanner;

public class SbChallengeOne {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		lastLetter(s);

	}
	public static String lastLetter(String str) {
		String ar[] = str.split(" ");
		int i;
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<ar.length;j++) {
			i = ar[j].length() -1;
			sb.append(ar[j].substring(0,i)).append(Character.toUpperCase(ar[j].charAt(i))).append(" ");
			
		}
		return sb.toString().trim();
		
	}

}
