package array;
class Student 
{
	public int rollno;
	public String name;
	void hi()
	{
		System.out.println("hello");
	}
  Student()
  {
	  System.out.println("Rahul is going to do some big projects !");
  }
}
public class Array1 {

	public static void main(String[] args) {
	
		Student s[]=new Student[2];//Complete array is declared 
		s[0]=new Student();
		s[1]=new Student();
		s[0].hi();
		s[0].name="Peter";
		s[1].name="Rahi";
		s[1].rollno=2;
		System.out.println(s[0].name);
		System.out.println(s[1].name);
	}

}
