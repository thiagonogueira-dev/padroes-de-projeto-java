package flyweight;

public class Teste 
{
	public static void main(String[] args) 
	{
		FlyweightFactory fw = new FlyweightFactory();
		fw.geraConexao(1);
		fw.geraConexao(1);
		fw.geraConexao(2);
		fw.geraConexao(2);
		fw.geraConexao(2);
		fw.geraConexao(4);
	}
}
