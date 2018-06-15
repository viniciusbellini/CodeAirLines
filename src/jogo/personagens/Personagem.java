package jogo.personagens;

public abstract class Personagem {

	private String nome;
	private TipoPersonagem tipoPersonagem;
	private int quantidade;
	
	public Personagem(TipoPersonagem tipoPersonagem) {
		this.tipoPersonagem = tipoPersonagem;
	}
	public abstract void embarcar();
	public abstract void desembarcar();

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void embarcarNoSmart() {
	}
	

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public TipoPersonagem getTipoPersonagem() {
		return tipoPersonagem;
	}
	public void setTipoPersonagem(TipoPersonagem tipoPersonagem) {
		this.tipoPersonagem = tipoPersonagem;
	}
}
