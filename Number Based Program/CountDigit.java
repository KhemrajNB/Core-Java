// Count the Number of Digit in the given Integer

public class CountDigit{
	public static int countDigit(int n){
		int  count=0;
		while(n>0){
			n=n/10;
			count++;
		}
		return count;
	}
	public static void main(String args[]){
		int n=2123;
		System.out.println("The length of "+n + " is " +countDigit(n));
}
}