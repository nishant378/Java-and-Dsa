package timeAndspace;

public class Visualisation {

	public static void main(String[] args) {
	
		
	//Visualisation with gnuplot or graph
		
		double a=System.nanoTime()/1000000.0; 	
	
	
	
		  for(int i=5;i<=2000;i++)
	       {
	    	 System.out.println(i+" "+(System.nanoTime()/1000000.0-a));
	  
	  /*  double b=System.nanoTime()/1000000.0; 
	      
	       System.out.println((b-a)+"ms");*/
	
	       }		 
	
		 
			 
	       
	

	}

}
