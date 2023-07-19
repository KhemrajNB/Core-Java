public class StrongNumber {	
	public static boolean isStrong(int n) {
		int temp = n;
		int sum = 0;
		while(temp>0) {
			int fact = 1;
			int num = temp%10;
			for(;num>0;num--) {
				fact *= num;
			}
			sum += fact;
			temp = temp/10;
		}
		
		return n==sum;
	}
	public static void main(String[] args) {
		System.out.println(isStrong(146));

	}

}
