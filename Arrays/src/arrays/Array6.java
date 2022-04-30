package arrays;
import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int k;
		int g=0,l=0,e=0;
		int a[];
		a=new int [5];
        System.out.println("Enter array:");
        for(int i=0;i<=4;i++)
        {
        	int value=obj.nextInt();
        	a[i]=value;
        }
        System.out.println("Enter constant value:");
        k=obj.nextInt();
        for(int i=0;i<=4;i++)
        {
        if(a[i]>k)
        {
        	g++;
        }
        else if(a[i]<k)
        {
        	l++;
        }
        else
        {
        	e++;
        }
        }
        obj.close();
        System.out.println("greater number :"+g+"; "+"lessor number:"+l+";  "+"equal number:"+e+";");
	}

}
