package Model;

import java.util.Objects;

public class Contato {
	private int id;
	private String nome;
	private String descricao;
	
	public Contato() {
		this.nome = "";
		this.descricao = "";
	}
	
	public Contato(int id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(descricao, other.descricao) && id == other.id && Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
	}
	
}
