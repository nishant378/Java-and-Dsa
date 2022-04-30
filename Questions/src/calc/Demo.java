package calc;


public class Demo
{
	public int sum(int...z)
	{
		int s=0;
		for(int i=0;i<z.length;i++)
		{
			s=s+z[i];
		}
		return s;
	}
	public int sub(int...z)//We have to give one arugment to z then it will run
	{
		int s=100;
		for(int i=0;i<z.length;i++)
		{
			s=s-z[i];
		}
		return s;
	}
	public int mul(int...z)//We have to give one arugment to z then it will run
	{
		int s=10;
		for(int i=0;i<z.length;i++)
		{
			s=s*z[i];
		}
		return s;
	}
	public int div(int...z)//We have to give one arugment to z then it will run
	{
		int s=32;
		for(int i=0;i<z.length;i++)
		{
			s=s/z[i];
		}
		return s;
	}//make another class and call demo class and its function for that class
}