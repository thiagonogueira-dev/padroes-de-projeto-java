package singleton;
public class TestaSingleton 
{
	public static void main(String[] args) 
	{
		Singleton sg1 = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		
		System.out.println(sg1);
		System.out.println(sg2);
		
	}
}
