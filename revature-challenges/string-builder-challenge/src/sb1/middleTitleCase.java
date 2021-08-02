package sb1;

import java.util.Scanner;

public class SbChallengeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		
		if(s.length()%2==0) {
			middleUpper(s);
		}
		if(s.length()%2!=0) {
			convertToTitleCase(s);
		}
		

	}
	
	
	public static String convertToTitleCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}
	public static String middleUpper(String s) {
		String ar[]=s.split(" ");
		int i = s.length()/2;
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			sb.append(Character.toUpperCase(ar[w].charAt(i))).append(ar[w].substring(0,i)).append(ar[w].substring(i)).append(" ");
		}
		
		return sb.toString().trim();
	}
}
