import java.util.ArrayList;
import java.util.List;

import Personagens.Personagem;


public class Aviao {
private static List<Personagem> aviao = new ArrayList<>();
	
	public static void adicionaPersonagemNoAviao(Personagem personagem) {
		aviao.add(personagem);
	}
	
	public static void removePersonagemDoAviao(Personagem personagem) {
		aviao.remove(personagem);
	}
	
	public List<Personagem> getAviao() {
		return aviao;
	}

	public static Personagem pesquisaPersonagemPorNome(String nome) {
		
		for(Personagem t: aviao) {
			if (t.getNome().equals(nome)) {
				return t;
			}
		}
		return null;
		
	}
	
	public static String ocupantesDoAviao() {
		String ocupantesDoAviao = "";
		for(Personagem p : aviao){
			ocupantesDoAviao = ocupantesDoAviao + p.getNome()+" | ";
		}
		return "Ocupantes do Avião: \n" + ocupantesDoAviao;
	}
}
