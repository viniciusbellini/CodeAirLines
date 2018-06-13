import javax.swing.JOptionPane;

import Personagens.Personagem;

public class JogoDoEmbarqueNoAviao {

	public static void main(String[] args) {
		
		Smart smart = new Smart();
		
		Terminal.popularTerminal();
		
		while (Smart.qtdeEmbarcadoNoSmart < 2) {
			Personagem pass = Terminal.pesquisaPersonagemPorNome(JOptionPane.showInputDialog(null,
					Terminal.ocupantesDoTerminal(),"Quem irá embarcar?", JOptionPane.QUESTION_MESSAGE));
			Smart.adicionarPersonagemNoSmart(pass);
			Terminal.removePersonagemDoTerminal(pass);
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
