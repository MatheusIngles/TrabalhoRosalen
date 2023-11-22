import greenfoot.*; 
import java.util.List;

public class Inimigos extends Actor
{   
    // Definindo as variaveis
    MyWorld mundo;
    public int NR;
    public int Hp = 25 + mundo.Horda;

    public Inimigos(int NR) {
        //Pega o numero aleatorio e define qual é a foto.
        this.NR = NR;
        getImage().scale(60, 60);
        switch(NR){

            case 2:
                setImage("2.png");
                getImage().scale(60, 60);
                break;

            case 3:
                setImage("3.png");
                getImage().scale(60, 60);
                break;

            case 4:
                setImage("4.gif");
                getImage().scale(60, 60);
                break;

            case 5:
                setImage("5.png");
                getImage().scale(60, 60);
                break;
        }
    }
    //Frame por frame.
    public void act() {
        Andar();
        ReceberDano();
    }
    //Faz eles mudarem de direcao, quando eles encostarem em determinados objetos.
    public void Andar(){
        move(3);
        //Baixo
        List <Caminho> giro90 = getObjectsAtOffset(-30, 0, Caminho.class);
        for(Caminho caminho: giro90){
            if(caminho.direcao == false && getRotation()== 0){
                setRotation(caminho.giro);
            }
        }
        //Direita
        List <Caminho> giro0 = getObjectsAtOffset(0, -30, Caminho.class);
        for(Caminho caminho: giro0){
            if(caminho.direcao == false && getRotation()== 90){
                setRotation(caminho.giro);
            }
        }
        //Cima
        List <Caminho> giro270 = getObjectsAtOffset(30, 0, Caminho.class);  // Ajuste aqui
        for(Caminho caminho: giro270){
            if(caminho.direcao == false && getRotation()== 180){
                setRotation(caminho.giro);
            }
        }
        //Esquerda
        List <Caminho> giro180 = getObjectsAtOffset(0, 30, Caminho.class);
        for(Caminho caminho: giro180){
            if(caminho.direcao == false && getRotation()== 270){
                setRotation(caminho.giro);
            }
        }
    }
    // diminuem o Hp, quando a flecha encostrar no inimigo.
    public void ReceberDano(){
        List<Flecha> flechas = getIntersectingObjects(Flecha.class);
        for (Flecha flecha : flechas) {
            Hp--;
            getWorld().removeObject(flecha);
        }
        if (Hp == 0) {
            getWorld().removeObject(this);
            mundo.coins += 5;
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
            mundo.PlayerHp--;
        }
    }
}
