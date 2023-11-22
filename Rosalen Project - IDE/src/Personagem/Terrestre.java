package Personagem;
import java.util.Random;

import Main.*;

public class Terrestre extends Personagem {

	Random r = new Random();
	
	public boolean correr() {
		
		int fugir = (r.nextInt(100) + 1);
		
		if (fugir % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void recuperarHp() {
		int resposta = InOut.leInt("Deseja Consumir uma Poção Para Recuperar Hp? \n"
									+ "1: Sim \n"
									+ "2: Negar Poção\n");
		switch(resposta) {
		
		case 1: 
			super.Hp *= 2;
			break;
			
		case 2:
			break;
		
		default:
			InOut.MsgDeAviso("Digite Certo", "Por favor selecione um numero entre 1 ou 2");
			break;
	}
	}
	
	public void falar() {}
	
}

