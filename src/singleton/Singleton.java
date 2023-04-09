package singleton;

public class Singleton 
{
	static Singleton sg = null;
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		if(sg == null)
		{
			sg = new Singleton();
		}
		
		return sg;
	}
}
