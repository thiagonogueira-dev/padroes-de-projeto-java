package factory_method;

public abstract class Conexao 
{
	String stringConexao;
	
	public Conexao(String conexao)
	{
		this.stringConexao = conexao;
		this.Conectar();
	}
	
	void Conectar()
	{
		System.out.println("conectado");
	}
}
