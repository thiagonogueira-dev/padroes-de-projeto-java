package mediator;

public class Pedido 
{	
	public void verificarProduto()
	{
		Mediator md = new Mediator();
		md.verificarQuantidade();
		md.verificarValorTotal();
		md.abaterEstoque(12);
	}
}
