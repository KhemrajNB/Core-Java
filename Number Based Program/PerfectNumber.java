public class PerfectNumber{
	public static boolean isPerfect(int n){
		int sum = 1;
		for(int i = 2; i<=n/2; i++){
			if(n%i==0){
				sum += i;
			}
		}
		return sum==n;
	}
	
	public static void main(String args[]){
		System.out.println(isPerfect(28));
	}
}