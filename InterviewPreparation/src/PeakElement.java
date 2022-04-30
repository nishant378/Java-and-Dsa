
public class PeakElement {

	public static void main(String[] args) {
		
		int a[]={10, 20, 15, 2, 23, 90, 67};
		int pe[]=new int[a.length];
		int temp=-1;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(i!=0 && i!=a.length-1)
            {
				
				if(a[i]>a[i+1] && a[i]>a[i-1])
				{
					temp++;
					pe[temp]=a[i];
				}
		    }
			else if(i==0)
			{
				if(a[i]>a[i+1])
				{
					temp++;
					pe[temp]=a[i];
				}
			}
			else if(i==a.length-1)
			{
				if(a[i]>a[i-1])
				{
					temp++;
					pe[temp]=a[i];
				}
			}
		}
		
		System.out.println("peak elements");
		for(int i=0;i<=temp;i++)
		{
			System.out.println(pe[i]);
		}
		
		

	}

}
