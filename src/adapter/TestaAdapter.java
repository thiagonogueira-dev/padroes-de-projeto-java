package adapter;

public class TestaAdapter 
{
	public static void main(String[] args) 
	{
		AdapterAluno al = new AdapterAluno();
		Controller ct = new Controller(al);
		ct.buscarAlunos();
	}
}
