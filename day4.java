import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    String c = Thousand_Separator(n);
	    System.out.println(c);
	}
	
	  public static String Thousand_Separator(int n){
    
        String res="";
        int total=0;
        if(n==0){
            return "0";
        }
      while(n>0){
        int m=n%10;
        n/=10;
        res=m+res;
        total+=1;
        if(total%3==0 && n>0){
            res=","+res;
        }
    }
    return res;
    }
}




