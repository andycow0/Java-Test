public class Hello
{
	private String _Name;
	public String Combined;
	public Hello()
	{
		this.Combined="";
	}
	
	public Hello(String name)
	{
		this();
		this._Name=name;
	}
	
	public void SayHello()
	{
		System.out.println("My name is "+ this._Name);
	}
	
	public void SetName(String newName)
	{
		this._Name=newName;
	}
	
	public String ShowAllChar(char... params)
	{
		this.Combined="";
		
		for (int i = 0; i < params.length; i++) {
			this.Combined+=params[i];
		}
		
		return this.Combined;
	}
}

