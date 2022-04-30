import java.util.*;
public class String10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=obj.nextLine();
		
		System.out.println("Enter a value which you want to delete:");
		char c=obj.next().charAt(0);
		
		char ch[]=s.toCharArray();
		
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==c)
			{
				count++;
				for(int j=i;j<ch.length-1;j++)
				{
					ch[j]=ch[j+1];
				}
			}
		}
		String str="";
		for(int i=0;i<ch.length-count;i++)
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		
		
	}

}
