package Personagem;
import Armas.*;
import Main.InOut;

public abstract class Personagem {
	
	Arma_IF arma;
	
	public int Hp, dano;
	
	public void desenha(int Icon) {
		InOut.MsgDeInformacao("Parabens", "Parabens vc matou o dragão", Icon);
	}
	
	public void arma() {
       dano = arma.usarArma();       
	}
	
	public void setArma(Arma_IF arma){
		this.arma = arma;
	}
	
	public void receberDano(int Dano) {
			Hp -= Dano;	
	}
}
