import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=obj.nextInt();
    int j;
	for(int i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		
		for(int k=(j-2);k>=1;k--)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}

	}

}
