public class SpyNumber {
	
	public static boolean isSpy(int n) {
		int sum = 0, pro = 1;
		while(n>0) {
			int ld = n%10;
			sum += ld;
			pro *= ld;
			n = n/10;
		}
		return sum==pro; 
		
	}
	
	public static void main(String[] args) {
		System.out.println(isSpy(1124));
	}

}
