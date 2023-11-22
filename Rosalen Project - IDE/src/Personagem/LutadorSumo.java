package Personagem;
import Armas.*;
import Main.InOut;

public class LutadorSumo extends Terrestre {

	public int Hp = 60;
	
	Desarmado armaLut = new Desarmado();
	
	public LutadorSumo() {
		super.Hp = Hp;
		setArma(armaLut);
	}
	
	@Override
	
	public void falar() {
		InOut.MsgDeAviso("Lutador de Sumo", "A gordura é proporcional a minha vitoria!!!!!");
	}
}
