package challenge;

import java.util.Scanner;

public class FourthCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		in.close();
		
		pythogoreanNumber(x,y);
		
	}
	public static double pythogoreanNumber(int a,int b){
		double c;
		c = (a*a) + (b*b);
		double d = Math.sqrt(c);
		return d;
	}

}
