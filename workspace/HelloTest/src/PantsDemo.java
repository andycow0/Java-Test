
public class PantsDemo {
	public static void main(String[] argus) {
		Pants pants = new Pants();
		
		pants.SetSize('L');
		pants.SetPrice(599.0);
		pants.Setwaistline(28);
		
		System.out.println("Size is "+pants.GetSize());
		System.out.println("Price is "+pants.GetPrice());
		System.out.println("Waistline is "+pants.GetWaistline());
		
		System.out.println();
		Pants1 pants1 = new Pants1();
		pants1.SetSize('X');
		pants1.SetPrice(-100.0);
		
		pants1.SetWaistline(28);
		System.out.println("Size is "+pants1.GetSize());
		System.out.println("Price is "+pants1.GetPrice());
		System.out.println("Waistline is "+pants1.GetWaistline());
		pants1.SomeMethod();
		
		Pants pants0=pants;
		System.out.println(pants.equals(pants1));
		System.out.println(pants.equals(pants0));
		
		pants1=null;
		System.gc();
		System.out.println("Program is over.");
	}
}
