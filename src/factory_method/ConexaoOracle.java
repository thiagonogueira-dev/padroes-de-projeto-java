package factory_method;

public class ConexaoOracle extends Conexao 
{
	ConexaoOracle(String conexao)
	{
		super(conexao);
		System.out.println("conectado ao BD oracle");
	}
}
