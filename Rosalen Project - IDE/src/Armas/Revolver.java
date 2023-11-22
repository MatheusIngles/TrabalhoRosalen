package Armas;
import  java.util.Random;
import  Main.*;

public class Revolver implements Arma_IF {
	
	Random r = new Random();
	int cartuchos = 6;
	
	@Override
	public int usarArma() {
		int Dano = r.nextInt(130)+1;
		if (cartuchos > 0) {
			cartuchos--;
		} else if(cartuchos == 0) {
			InOut.MsgDeErro("Vc Não tem cartuchos", "Vc Não tem cartuchos");
			Dano = 0;
		}
		return Dano;
	}	
	
	
}
