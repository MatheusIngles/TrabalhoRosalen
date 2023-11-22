import greenfoot.*;  

public class Escolha extends Actor
{   
    MyWorld mundo;

    public Escolha(){
        getImage().scale(60,60);
    }
    // faz mudar a tela para atualizar qual personagem que sera colocado.
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            mundo = (MyWorld) getWorld();
            mundo.Escolha++;
            if(mundo.Escolha == 1){
                setImage("Mago.png");
                getImage().scale(60,60);               
            }else if(mundo.Escolha == 2){
                setImage("guerreiro.png");
                getImage().scale(60,60); 
            }else if(mundo.Escolha == 3){
                setImage("Arqueiro.png");
                getImage().scale(60,60);
                
            }else if (mundo.Escolha == 4){
                setImage("Mago.png");
                getImage().scale(60,60); 
                mundo.Escolha = 1;
            }
        }
    }
}

