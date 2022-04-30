package array;

class DynamicArray { 
int array[]=new int[1]; 
int count=0; 
 int size=1; 

public void add(int data) 
{ 

    // check no of element is equal to size of array 
    if (count == size) { 
        growSize(); // make array size double 
    } // insert element at end of array 
    array[count] = data; 
    System.out.println("length:"+array.length);
    count++; 
} 

// function makes size double of array 
public void growSize() 
{ 

    int temp[] = null; 
    if (count == size) { 

       
        temp = new int[size * 2]; 
        
            for (int i = 0; i < size; i++) { 
              
                temp[i] = array[i]; 
            } 
        
    } 

    // double size array temp initialize 
    // into variable array again 
    array = temp; 
     
    
    size = size * 2; 
} 


}
public class DynamicArrays {

	public static void main(String[] args) {
	
DynamicArray da = new DynamicArray(); 
		  
        
        da.add(1); 
        da.add(2); 
        da.add(3); 
       
 
      
        System.out.println("Elements of array:"); 
        for (int i = 0; i < da.size; i++) { 
            System.out.print(da.array[i] + " "); 
        } 
  
        System.out.println(); 
  
        // print size of array and no of element 
        System.out.println("Size of array: " + da.size); 
        System.out.println("No of elements in array: " + 
                                              da.count); 
	}

}
