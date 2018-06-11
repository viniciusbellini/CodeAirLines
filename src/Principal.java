import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Terminal terminal = new Terminal();
		Smart smart = new Smart();
		
		Terminal.popularTerminal();
		//Terminal.pesquisaPessoaPorNome("Piloto");
		
		while (Smart.qtdeEmbarcadoNoSmart < 2) {
			Pessoa pass = Terminal.pesquisaPessoaPorNome(JOptionPane.showInputDialog("Digite o nome do passageiro a embarcar"));
			Smart.adicionarPessoaNoSmart(pass);
			Terminal.removePessoaDoTerminal(pass);
		}
		
		for (int i = 0; i < terminal.getTerminal().size(); i++) {
			System.out.println(terminal.getTerminal().get(i).getNome());
		}
		
		for (int i = 0; i < smart.getSmart().size(); i++) {
			System.out.println(smart.getSmart().get(i).getNome());
		}
//		
//		System.out.println(terminal.getOcupacao());
//		System.out.println(terminal.getCapacidade());
//		
//		Smart.levarParaAviao(new Piloto("teste"));	
		
	}

}
