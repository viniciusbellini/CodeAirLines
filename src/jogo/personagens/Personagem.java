package jogo.personagens;

public abstract class Personagem {

	private String nome;
	
	public Personagem(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void embarcarNoSmart() {
	}
	
	public abstract void embarcar();
	public abstract void desembarcar();
}
