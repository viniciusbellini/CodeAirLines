import java.util.ArrayList;
import java.util.List;

public class Terminal{

	private static List<Pessoa> terminal = new ArrayList<>();
	
	public static void popularTerminal() {
		adicionaPessoaNoTerminal(new Piloto("Piloto"));
		adicionaPessoaNoTerminal(new Oficial("Oficial 1"));
		adicionaPessoaNoTerminal(new Oficial("Oficial 2"));
		adicionaPessoaNoTerminal(new Chefe("Chefe"));
		adicionaPessoaNoTerminal(new Comissaria("Comissaria 1"));
		adicionaPessoaNoTerminal(new Comissaria("Comissaria 2"));
		adicionaPessoaNoTerminal(new Policial("Policial"));
		adicionaPessoaNoTerminal(new Presidiario("Presidiario"));
	}
	
	public static void adicionaPessoaNoTerminal(Pessoa pessoa) {
		terminal.add(pessoa);
	}
	
	public static void removePessoaDoTerminal(Pessoa pessoa) {
		terminal.remove(pessoa);
	}
	
	public List<Pessoa> getTerminal() {
		return terminal;
	}

	public static Pessoa pesquisaPessoaPorNome(String nome) {
		
		for(Pessoa t: terminal) {
			if (t.getNome().equals(nome)) {
				return t;
			}
		}
		return null;
		
	}
	
	public static String ocupantesDoTerminal() {
		String ocupantesTerminal = "";
		for(Pessoa p : terminal){
			ocupantesTerminal = ocupantesTerminal + p.getNome()+" | ";
		}
		return "Ocupantes do Terminal: \n" + ocupantesTerminal;
	}
	
}
