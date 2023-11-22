package Armas;
import java.util.Random;

public class Magia implements Arma_IF {

	Random r = new Random();	
	
	@Override
	public int usarArma() {
		int dano = r.nextInt(40)+10;
		return dano;
	}	

}
