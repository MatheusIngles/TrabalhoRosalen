import greenfoot.*; 
// Faz aparecer na tela as moedas e um Hack para ganhar moedas.
public class Coins extends Actor
{
    MyWorld world;

    public Coins(){
        setImage(new GreenfootImage("Suas Moedas: " + world.coins, 30, Color.BLACK, new Color(0,0,0,0)));
    }

    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Suas Moedas: " + world.coins, 30, Color.BLACK, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)){
            world.coins += 140;
        }
    }
}
