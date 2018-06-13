import java.util.ArrayList;
import java.util.List;

import Personagens.Personagem;

public class Smart{

	private static final String AVIAO = "Avião";
	private static final String TERMINAL = "Terminal";
	private static String localizacao;
	public static int qtdeEmbarcadoNoSmart;
	
	private static List<Personagem> smart = new ArrayList<>();
	
	public Smart() {
		Smart.localizacao = "Terminal";
	}

	public static void moverSmart(List<Personagem> passageiros) {
		
		if (PoliticaDaEmpresa.verificaSeExisteHabilitadoParaDirigirSmart(passageiros)){
		
			for(Personagem p : passageiros){
			
				if (localizacao == "Terminal") {
					System.out.println("Smart indo para " + AVIAO);
					setLocalizacao(AVIAO);
				}else {
					System.out.println("Smart indo para " + TERMINAL);
					setLocalizacao(TERMINAL);
				}
			break;
			}
		}
	}
	
	public static void levarParaTerminal() {
		
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public static void setLocalizacao(String localizacao) {
		Smart.localizacao = localizacao;
	}

	public static void adicionarPersonagemNoSmart(Personagem personagem) {
		smart.add(personagem);
		Smart.qtdeEmbarcadoNoSmart++;
		
	}

	public List<Personagem> getSmart() {
		return smart;
	}
	
	public static String ocupantesDoSmart() {
		String ocupantesDoSmart = "";
		for(Personagem p : smart){
			ocupantesDoSmart = ocupantesDoSmart + p.getNome()+" | ";
		}
		return "Ocupantes do Smart: \n" + ocupantesDoSmart;
	}

	
}
