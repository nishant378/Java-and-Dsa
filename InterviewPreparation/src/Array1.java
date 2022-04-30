import java.util.*;
public class Array1 {

	public static void main(String[] args) {
            @SuppressWarnings("resource")
			Scanner obj=new Scanner(System.in);
            int a[]=new int[5];
            System.out.print("Enter the values of array:");
            for(int i=0;i<a.length;i++)
            {
            	a[i]=obj.nextInt();
            }
		    
            System.out.print("Enter a element which you want to insert:");
            int num=obj.nextInt();
            
            System.out.print("Enter the position which you want to insert your element in:");
            int position=obj.nextInt();
           
            
            for(int i=a.length-2;i>=position-1;i--)
            {
            	a[i+1]=a[i];
            }
            a[position-1]=num;
            
            System.out.print("Your changed array is:");
            for(int i=0;i<a.length;i++)
            {
            	System.out.print(a[i]+" ");
            }
	}

}
