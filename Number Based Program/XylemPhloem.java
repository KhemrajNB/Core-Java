public class XylemPhloem{
	public static int len(int n){
		int count = 0;
		while(n>0){
			count++;
			n /= 10;
		}
		return count;
	}

	public static String xylemPhloem(int n){
		int len = len(n);
		int cor = 0, mid = 0;

		for(int i = 1; i <= len; i++){
			int ld = n%10;
			if(i == 1 || i == len){
				cor += ld;
			}
			else{
				mid += ld;
			}
			n /=10;
		}
		return mid==cor?"XYLEM":"PHLOEM";
	}
	
	public static void main(String args[]){
		System.out.println(xylemPhloem(13338));
	}
}