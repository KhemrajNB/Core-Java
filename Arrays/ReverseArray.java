public class ReverseArray{
	public static void printReverseArray(int arr[]){
		int sum = 0;
		for(int i = arr.length-1; i>=0; i--){
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] reverseArray(int arr[]){
		arr = arr.clone();
		for(int i =0; i<= arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return arr;
	}

	public static void main(String args[]){
		int a[] = {5,7,1,6,2,8,3,8,4,6};
		int b[] = reverseArray(a);
		for(int i : a){
			System.out.print(i + " ");
		}
		System.out.println();

		for(int i : b){
			System.out.print(i + " ");
		}

		System.out.println();
		//printReverseArray(b);
	}
}