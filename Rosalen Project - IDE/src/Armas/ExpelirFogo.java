package Armas;

public class ExpelirFogo implements Arma_IF {
	
	public int dano = 5;	
	
	@Override
	public int usarArma() {
		return dano;
	}	
	
}