package hashing;

import java.util.LinkedList;

class Hashing
{
	@SuppressWarnings("unchecked")
	LinkedList<Integer> hashtable[]=new LinkedList[10];
	
	Hashing()
	{
		for(int i=0;i<hashtable.length;i++)
		{
			hashtable[i]=new LinkedList<>();
		}
	}
	int hashfunction(int x)
	{
		return x%10;
	}
	
	void insertdata(int key,int data)
	{
		int index=hashfunction(key);
		hashtable[index].add(data);
	}
	
	void search(int key,int data)
	{
		int index=hashfunction(key);
               int n= hashtable[index].indexOf(data);
               if(n==-1)
               {
            	   System.out.println("Element not found");
               }
               else
               {
            	   System.out.println("Element found");
               }
	}
	
	void delete(int key,int data)
	{
		int index=hashfunction(key);
		     int n=hashtable[index].indexOf(data);
		     if(n!=-1)
		     {
		    	 System.out.println("Element deleted");
		    	 hashtable[index].remove(n);
		     }
		     else
		     {
		    	 System.out.println("This element isn't here");
		     }
	}
	
}
public class CreateHashtable {

	public static void main(String[] args) {
		 Hashing obj=new Hashing();
		         obj.insertdata(300,590);
		         obj.insertdata(4,56);
		         obj.insertdata(6,88);
		         obj.insertdata(200,57);
		         obj.insertdata(456,32);
		         obj.insertdata(782,90);
		         obj.insertdata(781,78);
		         obj.insertdata(783,904);
		         obj.insertdata(785,66);
		         obj.insertdata(787,4560);
		         obj.insertdata(788,68);
		         obj.insertdata(679,57);
		         
		         obj.search(456,88);
		         
		         obj.delete(434,56);
		         
		  for(int i=0;i<obj.hashtable.length;i++)
		   {
			   System.out.print(i);
			   for(Integer pCrawl : obj.hashtable[i])
			   {
				   System.out.print(" -> " +pCrawl);
			   }
			   System.out.println();
		   }
		  

	}

}
