package generics;
class Example
{ 
    <E>void display(E i[])
    {
    	for(int j=0;j<i.length;j++){
    		System.out.println(i[j]);
    	}
    }
    <E> void display(E i)
    {
    	System.out.println(i);
    }
}
public class Generics {

	public static void main(String[] args) {
		  Integer i[]={2,1,4,5,3};//If we using wrapper class then fine, but if we use primitive data type in array than it gives error 
		  String j[]={"h","r","i","l"};
	      Example obj=new Example();
	      obj.display(i);
	      obj.display(j);
	     obj.display(5);
	      int l=4;
	      obj.display(l);
	      char s='p';
	      obj.display(s);
	      int  k[]={2,1,4,5,3};
	      obj.display(k);//type parameter can represent only reference type(object) ,not primitive type (like int,double,char)
	      //We are talking about arrays
	      
	}

}
