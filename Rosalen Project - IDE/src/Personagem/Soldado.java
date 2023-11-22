package Personagem;
import Armas.*;
import Main.InOut;

public class Soldado extends Terrestre {
	
	public static int Hp = 40;
	
	Faca faca = new Faca();
	Revolver revolver = new Revolver();
	
	public Soldado() {
		super.Hp = Hp;
	}
	
	public void trocarArma() {
	        int escolha = InOut.leInt("Escolha a arma:\n"
	                + "1: Faca\n"
	                + "2: Revolver\n");
	        
	        switch (escolha) {
	            case 1:
	                setArma(faca);
	                break;
	            case 2:
	                setArma(revolver);
	                break;
	            default:
	                InOut.MsgDeAviso("Escolha Inválida", "Escolha uma arma válida.");
	        }
	 }
	
	@Override
	
	public void falar() {
		InOut.MsgDeAviso("Soldado", "Serei Promovido!!!!!");
	}
}
