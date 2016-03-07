//import java.util.Scanner;

public class WrapperTest {
	public static void main(String[] args) {
		// Scanner scan=new Scanner(System.in);
		System.out.println("Hello, this is Wrapper Test!!");

		Integer ageOfStudent = new Integer(20);

		System.out.print("The value of original Int:");
		System.out.println(ageOfStudent.intValue());

		System.out.print("double type:");
		System.out.println(ageOfStudent.doubleValue());

		Integer ageOfOthers = new Integer(10);

		int result = ageOfOthers.compareTo(ageOfStudent);

		switch (result) {
		case 1:
			System.out.println("More than.");
			break;
		case -1:
			System.out.println("Smaller than.");
			break;
		case 0:
			System.out.println("Equals.");
			break;
		}
		// ----------autoboxing & unboxing//----------
		Integer iRef1 = 100;
		Integer iRef2 = 100;
		if (iRef1 == iRef2)
			System.out.println("iRef1==iRef2");
		else
			System.out.println("iRef1!=iRef2");

		// ----------
		Integer iRef3 = 200;
		Integer iRef4 = 200;
		if (iRef3 == iRef4)
			System.out.println("iRef3==iRef4");
		else
			System.out.println("iRef3!=iRef4");

		// ----------
		String name1 = new String("Justin Lin");
		String name2 = new String("Justin Lin");
		System.out.println(name1 == name2);

		String[] a = { "Andy", "Cow0" };
		char[] b = { 'A', 'n', 'd', 'y', 'c', 'o', 'w', '0' };
		String name = new String(b);
		System.out.println(name);
		String Name = new String(b, 0, 2);
		System.out.println(Name);

		// ----------
		Hello h = new Hello("Andy");
		h.SayHello();
		h.SetName(name);
		h.SayHello();

		char[] cow0 = { 'c', 'o', 'w', '0' };
		h.ShowAllChar(cow0);
		System.out.println(h.Combined);
		// ----------

		SimpleMath math = new SimpleMath();
		System.out.println(math.Circumference(2));

	}
}
