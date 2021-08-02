package sb1;

public class SbChallengeThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reversePalindrome("hello hi good noon hope we got thread safety"));

	}
	public static String reversePalindrome(String s) {
		String[] ar = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i < ar.length-1;i++) {
			if(isPalindromeShortHand(ar[i])!=true) {
				StringBuilder sb1 = new StringBuilder(ar[i]);
				sb1.reverse();
				sb.append(sb1).append(" ");
				
				}
			else
				sb.append(ar[i]).append(" ");
		}
		
		return sb.toString().trim();
	}
	public static boolean isPalindromeShortHand(String s) {
			
		return new StringBuilder(s).reverse().toString().equals(s);
	}
	

}
