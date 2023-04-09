package flyweight;

import java.util.ArrayList;

public class FlyweightFactory 
{
	private ArrayList<Conexao> conexoes = new ArrayList<Conexao>();
	
	public Conexao geraConexao(int tipo)
	{
		for (Conexao conexao : this.conexoes) 
		{
			if(conexao.tipoconexao == tipo)
			{
				System.out.println("já tinha sido criada, tipo: " + tipo);
				return conexao;
			}
		}
		Conexao cnx = new Conexao(tipo);
		System.out.println("ainda não tinha sido criada, tipo: " + tipo);
		conexoes.add(cnx);
		return cnx;
	}
}
