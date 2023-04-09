package factory_method;

public class ConexaoMysql extends Conexao 
{
	ConexaoMysql(String conexao)
	{
		super(conexao);
		System.out.println("conectado ao BD mysql");
	}
	
}
