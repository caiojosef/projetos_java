package Service;
import Model.Contato;

public interface IContatoService {
	public void InserirContato(Contato contato);
	
	public void alterarContato(Contato contato);
	
	public void excluirContato(Contato contato);
	
	public Contato pesquisarContatoPorId(int id);
	
	public Contato [] listarContatos();

}
