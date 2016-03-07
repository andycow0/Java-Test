import Andycow0.Lib.*;
public class PolymorphismDemo {

	public static void main(String[] args) {
		Object obj1 = new String("Java Everywhere");

		Object obj2 = new String("Java Everywhere");

		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.equals(obj2));

		String str = (String) obj1;
		System.out.println(str.toUpperCase());

		Andycow0.Lib.Test test = new Andycow0.Lib.Test();
		test.SayHi();
		
		Test t = new Test();
		t.SayHi();
		
		Girl girl=new Girl();
		girl.SayHi();
	}
}
