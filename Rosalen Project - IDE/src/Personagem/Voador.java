package Personagem;
import java.util.Random;
import Main.InOut;

public class Voador extends Personagem {
	
	Random r = new Random();
	
	public boolean voar(){
		
		int fugir = (r.nextInt(100) + 1);
		
		if (fugir % 2 == 0 && fugir % 10 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void Rosnar() {
		InOut.MsgDeInformacao("Ronsnando", "SHAW GRAC SHAR (Correndo em uma direção talvez a sua)", 5);
	}
	
}
