package eg1;

public class ChallengeArrayThree {

	public static void main(String[] args) {
		
		int[] arr = {11,12,123,131,145,7,19,4556,78987,99};
		for(int i=0;i<arr.length;i++) {
			isPrime(arr[i]);
		}
	}
	public static void isPrime(int n) {
		 
		    boolean flag = false;
		    for (int i = 2; i <= n / 2; ++i) {
		      // condition for nonprime number
		      if (n % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (flag==false)
		      System.out.println(n);
		    
	}

}
