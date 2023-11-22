package Armas;

import java.util.Random;

public class Faca implements Arma_IF {

	Random r = new Random();
	
	
	@Override
	public int usarArma() {
		int Dano = r.nextInt(35)+25;
		return Dano;
	}	

}
