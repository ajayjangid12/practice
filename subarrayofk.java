import java.util.Arrays;
import java.util.Scanner;  
public class subarrayofk {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n; 
      n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      int k=sc.nextInt();
     int i=0;
      while(i<n-k+1)
      {
    	  int ar[]=new int[k];
    	  for(int t=0;t<k;t++)
    	  {
    		  ar[t]=arr[t+i];
    		  
    	  }
    	  Arrays.sort(ar);
    	  System.out.print(ar[k-1]+" ");
    	  i++;
      }
	
	}

}
