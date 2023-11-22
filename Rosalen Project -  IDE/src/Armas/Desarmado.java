package Armas;
import java.util.Random;

public class Desarmado implements Arma_IF {
	
	Random r = new Random();
	
	int Dano = r.nextInt(10)+1;
	
	@Override
	public void usarArma() {
		
	}	
	
}