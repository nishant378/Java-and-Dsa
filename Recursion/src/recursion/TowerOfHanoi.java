package recursion;
class T
{
	void towerOfHanoi(int n,int a,int b,int c)
	{
		if(n==1)
		{
			System.out.println("Move disk from" +" "+a+" "+"to"+" "+b);
			return ;
		}
		towerOfHanoi(n-1,a,c,b);
		System.out.println("Move disk from" +" "+a+" "+"to"+" "+b);
		towerOfHanoi(n-1,c,b,a);
	}
}
public class TowerOfHanoi {

	public static void main(String[] args) {
		T obj=new T();
		int n=4;
		obj.towerOfHanoi(n,1,2,3);
         
	}

}
