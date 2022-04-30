package ennums;
enum Dog
{
	u,uo,po;
	
    
}
public class PredefineMethod {

	public static void main(String[] args) {
		Dog obj[]=Dog.values();
		for(Dog obj1 : obj)
		{
	        System.out.println(obj1+" is index of:"+obj1.ordinal());
		}
		 System.out.println(Dog.valueOf("uo")); 
	}

}
