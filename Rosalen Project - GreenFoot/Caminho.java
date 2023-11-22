import greenfoot.*;  
// Define como sera o caminho.
public class Caminho extends Actor
{
    public int giro;
    public boolean direcao;
    //Define como vai ser o Caminho
    public Caminho(boolean direcao){
        getImage().scale(60, 60);
        this.direcao = direcao;
    }
    //E aki define 
    public Caminho(int giro){
        getImage().scale(60, 60);
        this.giro = giro;
    }

}
