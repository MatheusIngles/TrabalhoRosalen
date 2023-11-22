import greenfoot.*;  

public class Flecha extends Actor
{
    MyWorld world;
    public int MV = 15;

    public Flecha(){
        getImage().scale(10, 10);
    }
    // Faz a flecha mover em direcao ao inimigo e se alto deletar para deixa o mundo mais leve.
    public void act()
    {
        move(MV);
        altoRemover();
    }

    public void altoRemover(){
        if(isAtEdge() ==  true){
            getWorld().removeObject(this);
        }
    }
}
