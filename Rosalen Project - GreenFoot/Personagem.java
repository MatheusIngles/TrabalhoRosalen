import greenfoot.*;  
import java.util.List;

public class Personagem extends Actor
{
    Escolha escolha;
    MyWorld mundo;
    public int DelayTiro = 0, Range, Dps;
    
    public Personagem(){
        getImage().scale(60, 60);
    }
    // Faz atirarem flechas em direcao aos inimigos definindo o tempo entre cada flecha.
    public void encontrandoInimigos(int DPS, int Range){
        this.Range = Range;
        this.Dps = DPS;
        DelayTiro++;
        List<Inimigos> inimigo = getObjectsInRange(Range, Inimigos.class);
        if(DelayTiro > Dps){
            for (Inimigos eachInimigos : inimigo) {
                Flecha flecha = new Flecha(); 
                getWorld().addObject(flecha, getX(), getY());  
                flecha.turnTowards(eachInimigos.getX(), eachInimigos.getY());
                DelayTiro = 0;
            }
        }
    }
}
