import greenfoot.*;  
import java.util.List;
//define os parametros para o tempo do tiro.
public class Archer extends Personagem
{

    public Archer(){
        getImage().scale(60, 60);
    }

    public void act()
    {
        encontrandoInimigos(12, 150);
    }
}
