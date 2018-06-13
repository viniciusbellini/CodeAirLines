import java.util.ArrayList;
import java.util.List;

import Personagens.IPilotoSmart;
import Personagens.Personagem;

/*
 * Apenas o piloto e o chefe de serviço de voo podem dirigir este veículo. 
 * A empresa autorizou que o policial pudesse dirigir o veículo também.
 * Nenhum dos oficiais pode ficar sozinho com o chefe de serviço de bordo 
 * Nenhuma das comissárias pode ficar sozinha com o piloto.
 * Por motivos de segurança o presidiário não pode ficar sozinho em momento algum com os
  	tripulantes sem a presença do policial, nem no terminal e nem no avião.
*/
public class PoliticaDaEmpresa {
	
	public static boolean verificaSeExisteHabilitadoParaDirigirSmart(List<Personagem> passageiro){

		int cont = 0;
		
		for(Personagem p : passageiro){
			if (p instanceof IPilotoSmart)
				cont++;
		}
		
		return ((cont != 0) ? true : false);
	}
	
}
