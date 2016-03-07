
public class Pants1 extends Clothes {
	protected int waistline;
	public Pants1(){
		super();
	}
	// override
	public void SetSize(char size) {
		if (size != 'L' && size != 'M' && size != 'S')
			this.size = 'N';
		else
			this.size = size;
	}

	public void SetWaistline(int waistline) {
		this.waistline = waistline;
	}

	public int GetWaistline() {
		return this.waistline;
	}
	
	public void SomeMethod()
	{
		super.SomeMethod();
		System.out.println("Pant1s' SomeMethod!");
	}
	
	public void finalize()	{
		System.out.println("Pants1 has been recycled!");
	}
}
