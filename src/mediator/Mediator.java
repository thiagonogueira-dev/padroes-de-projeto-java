package mediator;

public class Mediator 
{
	Produto prod;
	
	Mediator()
	{
		this.prod = new Produto();
	}
	
	public int verificarQuantidade()
	{
		System.out.println("passou pelo mediator");
		return prod.verificarQuantidade();
	}
	
	public double verificarValorTotal()
	{
		System.out.println("passou pelo mediator");
		return prod.verificarValorTotal();
	}
	
	public boolean abaterEstoque(int qtd)
	{
		System.out.println("passou pelo mediator");
		return prod.abaterEstoque(qtd);
	}
}
