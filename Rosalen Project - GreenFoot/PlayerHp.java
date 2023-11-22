import greenfoot.*; 
//Player Hp que atualiza frame por frame.
public class PlayerHp extends Actor
{
    MyWorld world;

    public PlayerHp(){
        setImage(new GreenfootImage("PlayerHp: " + world.PlayerHp, 30, Color.BLACK, new Color(0,0,0,0)));
    }

    public void act()
    {
        setImage(new GreenfootImage("PlayerHp: " + world.PlayerHp, 30, Color.BLACK, new Color(0,0,0,0)));
    }
}
