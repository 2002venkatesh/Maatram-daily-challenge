import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(a[i]+a[j]==k){
		            System.out.println("True");
		            break;
		        }
		    }
		}
	}
}
