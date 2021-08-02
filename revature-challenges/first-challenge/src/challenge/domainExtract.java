package challenge;

import java.util.Scanner;

public class FirstCode {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		domainName(s);
	}
	public static String domainName(String str) {
		if(str.startsWith("https://")) {
			str = str.substring(8);
		}
		else
			if(str.startsWith("http://")) {
				str=str.substring(7);
			}
		int i=str.indexOf("/");
		str = str.substring(0,i);
		
		return str;
	}

}
