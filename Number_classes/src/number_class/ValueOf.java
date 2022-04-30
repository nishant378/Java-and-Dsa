package number_class;

public class ValueOf {

	public static void main(String[] args) {
		//because this is a static function
		
		System.out.println(Integer.valueOf(5));//integer
		System.out.println(Integer.valueOf("55"));//string
		System.out.println(Double.valueOf(3.33f));//float
		System.out.println(String.valueOf("hello"));
		System.out.println(Integer.valueOf("444",16));
	}

}
