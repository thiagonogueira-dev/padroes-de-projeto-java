package builder;

public class TestaPersonagem 
{
	public static void main(String[] args) 
	{
		PersonagemBuilder perBuilder = new PersonagemBuilder();
		perBuilder.addEspada().addEscudo().addArmadura();
		Personagem per = perBuilder.build();
		per.listaAcessorios();
	}
}
