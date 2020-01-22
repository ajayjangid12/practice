import java.util.*;  
public class leaders {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t;
      t = sc.nextInt();
      int arr[]=new int[t];
      for(int i=0;i<t;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      for(int i=1;i<t;i++)
      {
    	  int flag=0;
    	  if(arr[i-1]>arr[i])
    	  {
    		  flag=1;
    	  }
    	  else {
    		  flag=0;
    	  }
    	  if(flag==1)
    	  {
    		  System.out.print(arr[i-1]+" ");
    	  }
      }
      System.out.print(arr[t-1]);
	}

}
