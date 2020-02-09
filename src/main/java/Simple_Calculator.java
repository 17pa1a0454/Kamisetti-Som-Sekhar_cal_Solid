import java.io.*;
import java.util.*;

public class Simple_Calculator  {
	/*public static void op(String s,int i,int j,int a,int b,float c,float d){
	    if(s.charAt(i)=='+'){
        if(j==1) System.out.printf("Operation is Addition and value is= %d ",a+b);
        else System.out.printf("Operation is Addition and value is= %.2f ",c+d);
	
	    }
	    else if(s.charAt(i)=='-'){
	         if(j==1) System.out.printf("Operation is Subtraction and value is= %d ",a-b);
        else System.out.printf("Operation is Subtraction and value is= %.2f ",c-d);
	     
	    }
	    else if(s.charAt(i)=='*'){
	         if(j==1) System.out.printf("Operation is Multiplication and value is= %d ",a*b);
        else System.out.printf("Operation is Multiplication and value is= %.2f ",c*d);
	   
	    }
	    else{
	         if(j==1) System.out.printf("Operation is Division and value is= %d ",a/b);
        else System.out.printf("Operation is Division and value is= %.2f ",c/d);
	    }
	}
	
	public static int check(String s) {
		int i;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='.') return 1;
		}
			return 0;
	}*/
	
	  public static void main(String args[]) {
		  Scanner in=new Scanner(System.in);
         System.out.println("Enter addition or subtration or multiplication or division operation for simple claculator in String form:");
        System.out.println("\nExample= a + b ,where a&b need to be same datatype");
        String s=in.next();
         int k=check.check(s);
      int a=0,b=0;
      float c=0,d=0;
         int i;
         for(i=0;i<s.length();i++) {
        	 if((s.charAt(i)<48||s.charAt(i)>57)&&s.charAt(i)!='.') {
        		 if(k==1) {
        		 c=Float.valueOf(s.substring(0,i));
        		 d=Float.valueOf(s.substring(i+1));
        		 break;
        		 }
        		 else {
        			 a=Integer.valueOf(s.substring(0,i));
        			 b=Integer.valueOf(s.substring(i+1));
        		 break;
        		 }
        	 }
         }
         int j=0;
         if(a!=0&&b!=0) j=1;
         op.op(s,i,j,a,b,c,d);
	  }
}

