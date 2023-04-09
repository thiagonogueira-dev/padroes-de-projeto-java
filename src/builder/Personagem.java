package builder;

import java.util.ArrayList;

public class Personagem 
{
	ArrayList<String> acessorios = new ArrayList<String>();
	
	public void addAcessorio(String acessorio)
	{
		this.acessorios.add(acessorio);
	}
	
	public void listaAcessorios()
	{
		for (String string : acessorios) 
		{
			System.out.println(string);
		}
	}
}
