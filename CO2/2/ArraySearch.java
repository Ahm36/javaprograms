import java.util.Scanner;  
   
class ArraySearch  
{  
  public static void main(String args[])  
  {  
    int c, n, search, array[];  
   
    Scanner s1 = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = s1.nextInt();   
    array = new int[n];  
   
    System.out.println("Enter those " + n + " elements");  
   
    for (c = 0; c < n; c++)  
      array[c] = s1.nextInt();  
   
    System.out.println("Enter value to find");  
    search = s1.nextInt();  
   
    for (c = 0; c < n; c++)  
    {  
      if (array[c] == search) 
      {  
         System.out.println(search + " is present at location " + (c + 1) + ".");  
          break;  
      }  
   }  
   if (c == n) 
      System.out.println(search + " isn't present in array.");  
  }  
}  