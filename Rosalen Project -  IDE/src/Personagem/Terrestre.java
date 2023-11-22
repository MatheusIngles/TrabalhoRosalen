package Personagem;
import Main.*;

public class Terrestre extends Personagem {

	public String correr(String fuga) {
		this.fuga  = super.fuga;
		return fuga;
	}
	
	public String falar() {
		String Fala = InOut.leString("Fale Sua Suplica para poder Correr:");
		return Fala;
	}
	
}

