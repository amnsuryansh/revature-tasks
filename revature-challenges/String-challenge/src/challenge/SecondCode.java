


package challenge;

import java.util.Scanner;

public class SecondCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		
		isSecure(str);

	}
	public static boolean isSecure(String s) {
		boolean b= false;
		if(s.contains("https")) {
			b=true;
		}
		return b;
	}

}
