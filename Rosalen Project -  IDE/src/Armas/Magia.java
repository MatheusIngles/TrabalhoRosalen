package Armas;
import java.util.Random;

public class Magia implements Arma_IF {

	Random r = new Random();
	
	int Dano = r.nextInt(10)+1;
	
	@Override
	public void usarArma() {
		
	}	

}