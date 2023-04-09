package factory_method;

public class TestaFactory 
{
	public static void main(String[] args) 
	{
		FactoryConexao fac = new FactoryConexao();
		String strCnx = "Mysql";
		Conexao cnx = fac.getConexao(strCnx);
		strCnx = "Oracle";
		Conexao cnx2 = fac.getConexao(strCnx);
		System.out.println(cnx.stringConexao + cnx2.stringConexao);
	}
	
}
