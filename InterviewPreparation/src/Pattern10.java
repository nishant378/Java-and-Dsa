import java.util.Scanner;
public class Pattern10 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=obj.nextInt();
        int j;
        int temp=1,c=n;
        int count=1;
        for(int i=1;i<=n;i++)
        {
        	while(temp<c)
        	{
        		System.out.print(" ");
        		temp++;
        	}
        	j=i;
        	while(count<=i)
        	{
        		System.out.print(j+" ");
        		j++;
        		count++;
        	}
        	for(int k=(j-2);k>=i;k--)
        	{
        		System.out.print(k+" ");
        	}
        	temp=1;
        	c--;
        	count=1;
        	System.out.println();
        }

	}

}
