package adapter;

public class AdapterAluno implements iAlunoTXT
{

	public Aluno[] buscarAlunos()
	{
		AlunoBD alBD = new AlunoBD();
		System.out.println("Passou pelo adapter");
		alBD.buscarAlunos();
		return null;
	}
	
}
