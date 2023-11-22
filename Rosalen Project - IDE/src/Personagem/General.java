package Personagem;
import Armas.*;
import Main.InOut;

public class General extends Terrestre {

	
	public int Hp = 50;

	Faca faca = new Faca();
	Fuzil fuzil = new Fuzil();	
	
	public General() {
		super.Hp = Hp;
	}
	
	public void trocarArma() {
        int escolha = InOut.leInt("Escolha a arma:\n"
                + "1: Faca\n"
                + "2: fuzil\n");
        
        switch (escolha) {
            case 1:
                setArma(faca);
                break;
            case 2:
                setArma(fuzil);
                break;
            default:
                InOut.MsgDeAviso("Escolha Inválida", "Escolha uma arma válida.");
        }
 }
	
}
