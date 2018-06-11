import java.util.ArrayList;
import java.util.List;

public class Smart{

	private static final String AVIAO = "Avião";
	private static final String TERMINAL = "Terminal";
	private static String localizacao;
	public static int qtdeEmbarcadoNoSmart;
	
	private static List<Pessoa> smart = new ArrayList<>();
	
	public Smart() {
		Smart.localizacao = "Terminal";
	}

	public static void levarParaAviao(IPilotoSmart piloto) {
		
		if (localizacao == "Terminal") {
			System.out.println("Smart indo para " + AVIAO);
			setLocalizacao(AVIAO);
		}else {
			System.out.println("Smart indo para " + TERMINAL);
			setLocalizacao(TERMINAL);
		}
		
	}
	
	public static void levarParaTerminal(IPilotoSmart piloto) {
		
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public static void setLocalizacao(String localizacao) {
		Smart.localizacao = localizacao;
	}

	public static void adicionarPessoaNoSmart(Pessoa pessoa) {
		smart.add(pessoa);
		Smart.qtdeEmbarcadoNoSmart++;
		
	}

	public List<Pessoa> getSmart() {
		return smart;
	}

	
}
