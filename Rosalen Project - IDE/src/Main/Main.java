package Main;
import Personagem.*;

public class Main {

	public static void main(String[] args) {
		
		Terrestre personagem = null;
		int escolha, i = 0, escolha2, Morte = 0, icon = 0;
		
		InOut.MsgDeInformacao("Bem Vindo ao kill the dragons", "Selecione o personagen que vc quer:\n"
															+ "1: Mago \n"
															+ "2: Lutador de Sumo\n"
															+ "3: Soldado\n"
															+ "4: General\n", 5);
		escolha = InOut.leInt("Sua Resposta");
		
		switch(escolha) {
		
		case 1: 
			personagem =  new Mago();
			icon = 1;
			break;
			
		case 2:
			personagem = new LutadorSumo();
			icon = 3;
			break;
			
		case 3:
			personagem = new Soldado();
			icon = 4;
			break;
		
		case 4:
			personagem = new General();
			icon = 2;
			break;
			
		default:
			InOut.MsgDeAviso("ERRO", "Escolha Certo!!!!");
		}
		
		do {
			if(Morte == 0) {
				
			InOut.MsgDeInformacao("Vamos a Batalha", "Vamos a batalha então?\n"
													+ "1: Fugir?  \n"
													+ "2: Batalhar\n\n"
													+ "Seu Hp:" + personagem.Hp + "\n", 5);
			escolha2 = InOut.leInt("Sua Resposta");
			
			Dragao inimigo = new Dragao();
			
			if(escolha2 == 2) {
				while(true) {
					
					InOut.MsgDeInformacao("Estado Da Batalha", "Seu Hp: " + personagem.Hp + "\n"
															+ "Hp do Dragão:"+ inimigo.Hp + "\n", 6);
					
					if(personagem instanceof Soldado) {
						((Soldado) personagem).trocarArma();
						personagem.arma();
						inimigo.receberDano(personagem.dano);
						
					} else if (personagem instanceof General) {
						((General) personagem).trocarArma();
						personagem.arma();
						inimigo.receberDano(personagem.dano);
						
					} else {
						personagem.arma();
						inimigo.receberDano(personagem.dano);
					}
					
					if(inimigo.Hp <= 20) {
						if(inimigo.voar()== true) {
							
						}
					}
					
					if(inimigo.Hp >= 20) {
						if(inimigo.voar() == true) {
						inimigo.Rosnar();
						inimigo = null;
						personagem.desenha(icon);
						i++;
						break;
					}
				}
					
					if(inimigo.Hp <= 0) {
						personagem.desenha(icon);
						personagem.falar();
						i++;
						break;
					}
					
					inimigo.arma();
					personagem.receberDano(inimigo.dano);
					
					if(personagem.Hp == 10) {
						personagem.recuperarHp();
					}
					
					if(personagem.Hp == 0) {
						InOut.MsgDeInformacao("Vc Morreu", "Vc morreu!! Pelo Menos Vc tentou.\n"
															+ " Todos te lembrarao como o PLAYER que matou " + i + " Dragoes ", 6);
						inimigo.Rosnar();
						Morte++;
						break;
						
					}
				}
				
			} else if (escolha2 == 1) {
				if(personagem.correr() == true) {
					InOut.MsgDeInformacao("Parabens!!","Parabens Vc conseguiu fugir com sucesso!!\n"
													+ " A vila te agradece pelos " + i + " Dragoes mortos!\n"
													+ " Espero que tenha gostado da aventura!", icon);
					break;
				} else {
					InOut.MsgDeInformacao("Droga!!", "Droga vc da de frente para o dragão, logo quando vc decide correr pela sua vida.\n"
													+ "	Preparece para Lutar!!!", 6);
					while(true) {
						
						InOut.MsgDeInformacao("Estado Da Batalha", "Seu Hp: " + personagem.Hp + "\n"
																+ "Hp do Dragão:"+ inimigo.Hp + "\n", 6);
						
						if(personagem instanceof Soldado) {
							((Soldado) personagem).trocarArma();
							personagem.arma();
							inimigo.receberDano(personagem.dano);
							
						} else if (personagem instanceof General) {
							((General) personagem).trocarArma();
							personagem.arma();
							inimigo.receberDano(personagem.dano);
							
						} else {
							personagem.arma();
							inimigo.receberDano(personagem.dano);
						}
						
						if(inimigo.Hp >= 20) {
								if(inimigo.voar() == true) {
								inimigo.Rosnar();
								inimigo = null;
								personagem.desenha(icon);
								i++;
								break;
							}
						}
						
						if(inimigo.Hp <= 0) {
							personagem.desenha(icon);
							personagem.falar();
							i++;
							break;
						}
						
						inimigo.arma();
						personagem.receberDano(inimigo.dano);
						
						if(personagem.Hp == 10) {
							personagem.recuperarHp();
						}
						
						if(personagem.Hp == 0) {
							InOut.MsgDeInformacao("Vc Morreu", "Vc morreu!! Pelo Menos Vc tentou.\n"
																+ " Todos te lembrarao como o PLAYER que matou " + i + " Dragoes ", 6);
							inimigo.Rosnar();
							Morte++;
							break;
							
						}
					}
					
				}
				
			} else if (escolha2 == 3) {
				InOut.MsgDeAviso("ERRO", "Escolha Certo!!!!");
			}
			
			} else if(Morte == 2) {
				break;
			}
			}while(true);
		

	}

}
