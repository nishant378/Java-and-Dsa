package arraysClass;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
	int a[]=new int [5];
     a[0]=2;
     a[1]=3;
     a[2]=4;
     a[3]=1;
     a[4]=1;
     Arrays.sort(a);
     Arrays.sort(a,1, 3);
     System.out.println("Binary Search:"+Arrays.binarySearch(a,6));
     for(int i=0;i<=4;i++)
     {
    	 System.out.println(a[i]);
     }
     
	}

}
