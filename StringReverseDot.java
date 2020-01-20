import java.util.Scanner;  
public class StringReverseDot {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t;
      t = sc.nextInt();
      for(int j=0;j<t;j++)
      {   
        	  String str=sc.next();
        	  String [] s=str.split("\\.");
        	  int l=s.length;
        	
        	  for(int k=l-1;k>0;k--)
        	  {
        		  System.out.print(s[k]+".");
        		 
        	  }
        	  System.out.println(s[0]);

      }
	
	}

}
