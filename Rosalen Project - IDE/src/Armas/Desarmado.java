package Armas;
import java.util.Random;

public class Desarmado implements Arma_IF {
	
	Random r = new Random();
		
	@Override
	public int usarArma() {
		int Dano = r.nextInt(40)+10;
		return Dano;
	}	
	
}