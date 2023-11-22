import greenfoot.*;  
import java.util.List;
//define os parametros para o tempo do tiro.
public class guerreiro extends Personagem
{

    public guerreiro(){
        getImage().scale(60, 60);
    }

    public void act()
    {
        encontrandoInimigos(5,100);
    }
}
