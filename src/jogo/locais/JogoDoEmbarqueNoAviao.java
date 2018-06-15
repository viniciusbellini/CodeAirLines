package jogo.locais;
import javax.swing.JOptionPane;

import jogo.personagens.Personagem;
import jogo.personagens.TipoPersonagem;

public class JogoDoEmbarqueNoAviao {

	public static void main(String[] args) {
		
		Smart smart = new Smart();
		
		Terminal terminal = new Terminal();
		
		terminal.popularTerminal();
		
		while (Smart.qtdeEmbarcadoNoSmart < 2) {
			Personagem pass = Terminal.pesquisaPersonagemPorTipoPersonagem(JOptionPane.showInputDialog(null,
					Terminal.ocupantesDoTerminal(),"Quem irá embarcar?", JOptionPane.QUESTION_MESSAGE));
			Smart.adicionarPersonagemNoSmart(pass);
			Terminal.removePersonagemDoTerminal(pass);
		}
		
		Smart.moverSmart(smart.getSmart());
		
		System.out.println(Terminal.ocupantesDoTerminal());
		System.out.println(Smart.ocupantesDoSmart());
		System.out.println(Aviao.ocupantesDoAviao());
		
	}

}
