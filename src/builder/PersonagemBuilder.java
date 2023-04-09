package builder;

public class PersonagemBuilder 
{
	private Personagem personagem;
	
	public PersonagemBuilder()
	{
		this.personagem = new Personagem();
	}
	
	private void reset()
	{
		this.personagem = new Personagem();
	}
	
	public PersonagemBuilder addEspada()
	{
		this.personagem.addAcessorio("Espada");
		return this;
	}
	
	public PersonagemBuilder addEscudo()
	{
		this.personagem.addAcessorio("Escudo");
		return this;
	}
	
	public PersonagemBuilder addArmadura()
	{
		this.personagem.addAcessorio("Armadura");
		return this;
	}
	
	public Personagem build()
	{
		Personagem per = this.personagem;
		this.reset();
		return per;
	}
}
