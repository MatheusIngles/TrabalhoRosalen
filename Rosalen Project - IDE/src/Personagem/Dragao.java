package Personagem;
import Armas.*;

public class Dragao extends Voador {
	
	ExpelirFogo fogo = new ExpelirFogo();
	
	
	public Dragao() {
		super.Hp = 60;
		setArma(fogo);
	} 
	
	
}
