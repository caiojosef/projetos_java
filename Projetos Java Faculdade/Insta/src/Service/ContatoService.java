package Service;

import Model.Contato;

public class ContatoService implements IContatoService {
	
	private Contato [] contatos;
	private int idx;
	public ContatoService(int tamanho) {
		this.contatos = new Contato[tamanho];
	}

	@Override
	public void InserirContato(Contato contato) {
		this.contatos[idx] = contato;
		idx++;
		
	}

	@Override
	public void alterarContato(Contato contato) {
		this.contatos[contato.getId()] = contato;
		
	}

	@Override
	public void excluirContato(Contato contato) {
		this.contatos[contato.getId()] = null;
		
	}

	@Override
	public Contato pesquisarContatoPorId(int id) {
		
		return this.contatos[id];
	}

	@Override
	public Contato[] listarContatos() {
		// TODO Auto-generated method stub
		return this.contatos;
	}
	
	
}
