package Armas;
import java.util.Random;

import Main.InOut;

public class Fuzil implements Arma_IF {
	
	Random r = new Random();
	int cartuchos = 10;
	
	@Override
	public int usarArma() {
		int Dano = r.nextInt(70)+10;
		if (cartuchos > 0) {
			cartuchos--;
		}else if(cartuchos == 0) {
			InOut.MsgDeErro("Vc Não tem cartuchos", "Vc Não tem cartuchos");
			Dano = 0;
		}
		return Dano;
	}	
	
}
