package Personagem;
import Armas.*;
import Main.InOut;

public class Mago extends Terrestre {
	
	public int Hp = 30;
	
	Magia magia = new Magia();
	
	public Mago() {
		super.Hp = Hp;
		setArma(magia);
	}
	
	@Override
	public void falar() {
		InOut.MsgDeAviso("Mago", "Serei O mestre dos Magos!!!!!");
	}
}
