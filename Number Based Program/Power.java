public class Power{
	public static int power(int x, int y){
		int ans = 1;
		for(int i = 1;i<=y;i++){
			ans *= x;
		}
		return ans;
	}
	
	public static void main(String args[]){
		System.out.println(power(2,3));
	}
}