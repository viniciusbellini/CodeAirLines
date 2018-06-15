package jogo.locais;
import static jogo.personagens.TipoPersonagem.CHEFE;
import static jogo.personagens.TipoPersonagem.COMISSARIA;
import static jogo.personagens.TipoPersonagem.OFICIAL;
import static jogo.personagens.TipoPersonagem.PILOTO;
import static jogo.personagens.TipoPersonagem.POLICIAL;
import static jogo.personagens.TipoPersonagem.PRESIDIARIO;

import java.util.ArrayList;
import java.util.List;

import jogo.personagens.Chefe;
import jogo.personagens.Comissaria;
import jogo.personagens.Oficial;
import jogo.personagens.Personagem;
import jogo.personagens.PersonagensFactory;
import jogo.personagens.Piloto;
import jogo.personagens.Policial;
import jogo.personagens.Presidiario;
import jogo.personagens.TipoPersonagem;

public class Terminal{

	private static List<Personagem> terminal = new ArrayList<>();
	
	public Terminal() {
		
	}
	
	public void popularTerminal() {
		Personagem piloto = PersonagensFactory.retornarNovoPersonagem(PILOTO);
		Personagem oficial1 = PersonagensFactory.retornarNovoPersonagem(OFICIAL);
		Personagem oficial2 = PersonagensFactory.retornarNovoPersonagem(OFICIAL);
		Personagem chefe = PersonagensFactory.retornarNovoPersonagem(CHEFE);
		Personagem comissaria1 = PersonagensFactory.retornarNovoPersonagem(COMISSARIA);
		Personagem comissaria2 = PersonagensFactory.retornarNovoPersonagem(COMISSARIA);
		Personagem policial = PersonagensFactory.retornarNovoPersonagem(POLICIAL);
		Personagem presidiario = PersonagensFactory.retornarNovoPersonagem(PRESIDIARIO);
		adicionaPersonagemNoTerminal(piloto);
		adicionaPersonagemNoTerminal(oficial1);
		adicionaPersonagemNoTerminal(oficial2);
		adicionaPersonagemNoTerminal(chefe);
		adicionaPersonagemNoTerminal(comissaria1);
		adicionaPersonagemNoTerminal(comissaria2);
		adicionaPersonagemNoTerminal(policial);
		adicionaPersonagemNoTerminal(presidiario);
	}
	
	public static void adicionaPersonagemNoTerminal(Personagem personagem) {
		terminal.add(personagem);
	}
	
	public static void removePersonagemDoTerminal(Personagem personagem) {
		terminal.remove(personagem);
	}
	
	public List<Personagem> getTerminal() {
		return terminal;
	}

	public static Personagem pesquisaPersonagemPorTipoPersonagem(String string) {
		//TODO Corrigir este metodo
		for(Personagem t: terminal) {
			if (t.getTipoPersonagem().toString() == string) {
				return t;
			}
		}
		return null;
		
	}
	
	public static String ocupantesDoTerminal() {
		String ocupantesTerminal = "";
		for(Personagem p : terminal){
			ocupantesTerminal = ocupantesTerminal +" |" + p.getTipoPersonagem();
		}
		return "Ocupantes do Terminal: \n" + ocupantesTerminal;
	}
	
}
