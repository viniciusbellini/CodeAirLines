import java.util.ArrayList;
import java.util.List;


public class Aviao {
private static List<Pessoa> aviao = new ArrayList<>();
	
	public static void adicionaPessoaNoAviao(Pessoa pessoa) {
		aviao.add(pessoa);
	}
	
	public static void removePessoaDoAviao(Pessoa pessoa) {
		aviao.remove(pessoa);
	}
	
	public List<Pessoa> getAviao() {
		return aviao;
	}

	public static Pessoa pesquisaPessoaPorNome(String nome) {
		
		for(Pessoa t: aviao) {
			if (t.getNome().equals(nome)) {
				return t;
			}
		}
		return null;
		
	}
	
	public static String ocupantesDoAviao() {
		String ocupantesDoAviao = "";
		for(Pessoa p : aviao){
			ocupantesDoAviao = ocupantesDoAviao + p.getNome()+" | ";
		}
		return "Ocupantes do Avião: \n" + ocupantesDoAviao;
	}
}
