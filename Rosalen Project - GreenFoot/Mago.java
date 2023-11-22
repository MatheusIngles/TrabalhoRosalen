import greenfoot.*;  
import java.util.List;
//define os parametros para o tempo do tiro.
public class Mago extends Personagem
{

    public Mago(){
        getImage().scale(60, 60);
    }

    public void act()
    {
        encontrandoInimigos(20, 600);
    }
}
