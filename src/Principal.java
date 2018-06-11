import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Smart smart = new Smart();
		
		Terminal.popularTerminal();
		//Terminal.pesquisaPessoaPorNome("Piloto");
		
		while (Smart.qtdeEmbarcadoNoSmart < 2) {
			Pessoa pass = Terminal.pesquisaPessoaPorNome(JOptionPane.showInputDialog(null,
					Terminal.ocupantesDoTerminal(),"Quem irá embarcar?", JOptionPane.QUESTION_MESSAGE));
			Smart.adicionarPessoaNoSmart(pass);
			Terminal.removePessoaDoTerminal(pass);
		}
		
		Smart.moverSmart(smart.getSmart());
		
		System.out.println(Terminal.ocupantesDoTerminal());
		System.out.println(Smart.ocupantesDoSmart());
		System.out.println(Aviao.ocupantesDoAviao());
//		
//		System.out.println(terminal.getOcupacao());
//		System.out.println(terminal.getCapacidade());
//		
//		Smart.levarParaAviao(new Piloto("teste"));	
		
	}

}
