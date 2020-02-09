
public class op {
	public static void op(String s,int i,int j,int a,int b,float c,float d){
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
}
