package Personagem;
import Armas.*;
import Main.*;

abstract class Personagem {
	
	String fuga = "Metendo o pé";
	Arma_IF arma;
	
	public static int Hp, dano, danox2 = dano * 2;
	public static boolean RecusouCura = false;
	
	public void desenha() {}
	
	public void arma() {
		arma.usarArma();
	}
	
	public void arma(Arma_IF arma){}
	
	public void recuperarHp() {
		int resposta = InOut.leInt("Deseja Consumir uma Poção Para Recuperar Hp? \n"
									+ "1: Sim \n"
									+ "2: Negar Poção e Receber 2x no seu valor de dano");
		switch(resposta) {
		
		case 1: 
			Hp *= 2;
			break;
			
		case 2:
			RecusouCura = true;
			break;
		
		default:
			InOut.MsgDeAviso("Digite Certo", "Por favor selecione um numero entre 1 ou 2");
			break;
		}		
	}
	
}
