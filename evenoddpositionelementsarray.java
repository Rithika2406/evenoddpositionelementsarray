import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    int n=S.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=S.nextInt();
	    }
	    int choice=S.nextInt();
	    if(choice==0)
	    {
	        System.out.println("evenposition");
	        for(int i=0;i<n;i=i+2)
	        {
	            System.out.println(arr[i]);
	        }
	    }
	    else{
	        System.out.println("oddposition");
	        for(int i=1;i<n;i=i+2)
	        {
	            System.out.println(arr[i]);
	        }
	    }
	   
	}
}