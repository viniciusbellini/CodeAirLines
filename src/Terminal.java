import java.util.ArrayList;
import java.util.List;

public class Terminal{

	private static List<Personagem> terminal = new ArrayList<>();
	
	public static void popularTerminal() {
		adicionaPersonagemNoTerminal(new Piloto("Piloto"));
		adicionaPersonagemNoTerminal(new Oficial("Oficial 1"));
		adicionaPersonagemNoTerminal(new Oficial("Oficial 2"));
		adicionaPersonagemNoTerminal(new Chefe("Chefe"));
		adicionaPersonagemNoTerminal(new Comissaria("Comissaria 1"));
		adicionaPersonagemNoTerminal(new Comissaria("Comissaria 2"));
		adicionaPersonagemNoTerminal(new Policial("Policial"));
		adicionaPersonagemNoTerminal(new Presidiario("Presidiario"));
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

	public static Personagem pesquisaPersonagemPorNome(String nome) {
		
		for(Personagem t: terminal) {
			if (t.getNome().equals(nome)) {
				return t;
			}
		}
		return null;
		
	}
	
	public static String ocupantesDoTerminal() {
		String ocupantesTerminal = "";
		for(Personagem p : terminal){
			ocupantesTerminal = ocupantesTerminal + p.getNome()+" | ";
		}
		return "Ocupantes do Terminal: \n" + ocupantesTerminal;
	}
	
}
