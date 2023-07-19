public class NeonNumber {
	public static boolean isNeon(int n) {
		int res = n*n;
		int sum = 0;
		while(res>0) {
			int ld = res%10;
			sum += ld;
			res=res/10;
		}
		return n==sum;
	}
	public static void main(String[] args) {
		System.out.println(isNeon(9));
	}

}
