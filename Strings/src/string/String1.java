package string;

public class String1 {

	public static void main(String[] args) {
		String a[];
		a=new String [5];
		a[0]="Hello";
		a[1]="my";
		a[2]="dear";
		a[3]="friend";
	    a[4]="Bob!!";
		
          for(int i=0;i<=4;i++)
          {
        	  System.out.print(" "+a[i]);
          }
          for(String b:a)//String b copies elements of Array a
          {
        	  System.out.println(" "+b);
          }
          
	}

}
