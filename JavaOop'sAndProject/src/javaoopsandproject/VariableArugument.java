package javaoopsandproject;

class Variable_Argument
{
	void display(String...value)
	{
		System.out.println("display variable_argument");
		for(int i=0;i<value.length;i++)
		{
			System.out.print(value[i]+" ");
		}
	}
}
public class VariableArugument {

	public static void main(String[] args) {
		Variable_Argument obj=new Variable_Argument();
		obj.display("my","name","is","varargs");

	}

}
