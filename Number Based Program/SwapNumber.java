import java.util.Scanner;

public class SwapNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + " : " + b);
		System.out.println("After Swaping using Temp Variable");
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " : " + b);
		System.out.println("After Swaping Without using Temp Variable");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " : " + b);
	}
}