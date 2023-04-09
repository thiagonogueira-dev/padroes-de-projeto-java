package factory_method;

public class FactoryConexao 
{
	public Conexao getConexao(String conexao)
	{
		if(conexao.equals("Mysql"))
			return new ConexaoMysql(conexao);
		else if(conexao.equals("Oracle"))
			return new ConexaoOracle(conexao);
		else 
			return null;
	}
}
