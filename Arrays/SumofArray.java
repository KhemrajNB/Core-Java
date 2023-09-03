public class SumofArray{
	public static int sumOfArray(int arr[]){
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String args[]){
		int a[] = {5,7,1,6,2,8,3,8,4,6};

		System.out.println(sumOfArray(a));
	}
}