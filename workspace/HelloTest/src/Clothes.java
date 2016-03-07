
public class Clothes {
	protected char size;
	protected double price;

	public void SetSize(char size) {
		this.size = size;
	}

	public char GetSize() {
		return this.size;
	}

	public void SetPrice(double price) {
		this.price = price;
	}

	public double GetPrice() {
		return this.price;
	}
	
	public void SomeMethod()
	{
		System.out.println("Clothes' SomeMethod!");
	}
}
