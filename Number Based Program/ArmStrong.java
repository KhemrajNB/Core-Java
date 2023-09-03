public class ArmStrong{
	public static int len(int n){
		int count = 0;
		while(n>0){
			count++;
			n /= 10;
		}
		return count;
	}

	public static int power(int x, int y){
		int pro = 1;
		for(int i = 1; i <= y; i++){
			pro *= x;
		}
		return pro;
	}

	public static boolean isArmStrong(int n){
		int len = len(n);
		int sum = 0;
		int temp = n;
		while(n>0){
			sum += power(n%10,len);
			n /= 10;
		}
		return sum == temp;
	}

	public static void main(String args[]){
		System.out.println(isArmStrong(153));
	}
}