import greenfoot.*;  
// Faz aparecer na tela.
public class Horda extends Actor
{
    MyWorld world;

    public Horda(){
        setImage(new GreenfootImage("Horda: " + world.Horda, 30, Color.BLACK, new Color(0,0,0,0)));
    }

    public void act()
    {
        setImage(new GreenfootImage("Horda: " + world.Horda , 30, Color.BLACK, new Color(0,0,0,0)));
    }
}
