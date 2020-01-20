import java.util.Scanner;  
public class StringDuplicateRemove {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t;
      t = sc.nextInt();
      for(int j=0;j<t;j++)
      {   
        	  String str=sc.next();
        	  String s="";
        	  int l=str.length();
        	  if(str.charAt(0)!=str.charAt(1))
        	  {
        		  s=s+str.charAt(0);
        		  
        	  }
              for(int i=1;i<l-1;i++)
              {
            	  if(str.charAt(i)!=str.charAt(i-1)&&str.charAt(i)!=str.charAt(i+1))
            	  {
            		  s=s+str.charAt(i);
            	  }
              }
              
              if(str.charAt(l-1)!=str.charAt(l-2))
        	  {
        		  s=s+str.charAt(l-1);
        		  
        	  }
            System.out.println(s);
      }
	
	}

}
