package adapter;

public class Controller 
{
	iAlunoTXT aTxt = null;
	
	public Controller(iAlunoTXT a) 
	{
		this.aTxt = a;
	}
	
	public Aluno[] buscarAlunos()
	{
		aTxt.buscarAlunos();
		return null;
	}
}
