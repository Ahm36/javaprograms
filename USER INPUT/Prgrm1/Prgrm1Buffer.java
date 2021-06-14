import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prgrm1Buffer {
	public static void main(String[] args)
	
			throws IOException
	{
		
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of Array:");
		int a=Integer.parseInt(r.readLine());
		int[] arr=new int[a];
		
		System.out.println("Enter ArrayElements:");
		for(int i=0;i<a;i++)
		{
			arr[i]=Integer.parseInt(r.readLine());
		}
		System.out.println("Array elements are:");
		for(int i=0;i<a;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}