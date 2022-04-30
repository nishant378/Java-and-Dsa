package array;

public class CopingArray {

	public static void main(String[] args) {
	 int []a= {1,2};
	 int []b=new int[2];
	 System.arraycopy(a,0,b,0,2);
	 for(int i=0;i<b.length;i++)
	 {
		 System.out.println(b[i]);
	 }

	}

}
