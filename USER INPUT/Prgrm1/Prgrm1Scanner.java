import java.util.Scanner;

public class Prgrm1Scanner {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the length of array:");
		int len=s.nextInt();
		int[] arr=new int[len];
		
		System.out.println("Enter array Elements:");
		for(int i=0;i<len;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Array elements are:");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}