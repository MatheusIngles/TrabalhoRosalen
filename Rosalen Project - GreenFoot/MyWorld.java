// Inportando As bibliotecas.
import greenfoot.*; 
import java.util.List;
import java.util.Random;

public class MyWorld extends World
{
    // Declarando o random para poder mudar a ordem dos inimigos de forma aleatoria.
    Random random = new Random();
    // Definindo Personagem como uma variavel.
    Personagem Personagem;
    // Criando as variaveis.
    public static int coins = 140, Horda = 1, Escolha = 1,  PlayerHp = 100; 
    public int PersonagemCoins = 70, Time = 0, hordaDelay = 0, enemyCreationDelay = 0, enemyIndex = 0;    
    // Criando o mapa e definindo os numeros onde serão cada Caminho.
    int mapa[][] = {
            {0,0,0,0,3,1,1,1,1,2},
            {1,2,0,0,1,0,0,0,0,1},
            {0,1,0,0,4,1,1,5,0,1},
            {0,1,0,0,0,0,0,1,0,1},
            {0,1,0,3,1,2,0,1,0,1},
            {0,1,0,1,0,1,0,1,0,1},
            {0,1,0,1,0,1,0,1,0,1},
            {0,1,0,1,0,1,0,1,0,1},
            {0,3,1,4,0,3,1,4,0,1},
            {0,0,0,0,0,0,0,0,0,1}
        };
    // Criando um codigo MyWorld, sendo assim quando MyWorld comecar ele chamara: O menu, Coins, Horda, PlayerHp, Banner e Escolha ai depois ele chama Game().
    public MyWorld()
    {    
        super(840, 600, 1);
        // Reseta as variaveis e tras elas de volta a seu estado padrao.
        DeNovo();
        // Instancia os objetos
        Menu menu = new Menu();
        addObject(menu,720,300);
        addObject(new Coins(), 712,30);
        addObject(new Horda(), 712,50);
        addObject(new PlayerHp(), 712, 70);
        addObject(new banner(),720, 410);
        Escolha escolha = new Escolha();
        addObject(escolha, 712, 120);
        //Cria o mapa do jogo.
        Game();
    }
    // Assim como os outros Acts ele vai rodar Frame por frame
    public void act(){
        // Verifica se é aconteceu uma derrota
        if(Derrota()){
            return;
        }
        // Ve quanto custara cada personagem.
        SelecionandoPersonagem();
        // Verifica as condicoes e cria o personagem. 
        AddPersonagem();
        // Faz com que o Tempo do mundo ande para ajudar na contagem de inimigos
        Time++;
        //
        criandoInimigos();
    }
    // Cria o Mapa do jogo e como ele vai ser criado alocando onde os caminhos que mudarao os personagens de direcao.
    private void Game()
    {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                //Caminho Normal
                if(mapa[j][i] == 1){
                    addObject(new Caminho(true), 30 + i * 60, 30 + j * 60);
                }
                //Baixo.
                if(mapa[j][i] == 2){
                    addObject(new Caminho(90), 30 + i * 60, 30 + j * 60);
                }
                //Direita.
                if(mapa[j][i] == 3){
                    addObject(new Caminho(0), 30 + i * 60, 30 + j * 60);
                }
                //Cima.
                if(mapa[j][i] == 4){
                    addObject(new Caminho(270), 30 + i * 60, 30 + j * 60);
                }
                //Esquerda.
                if(mapa[j][i] == 5){
                    addObject(new Caminho(180), 30 + i * 60, 30 + j * 60);
                }
            }
        }
    }
    // Verifica o preco que vai ser cada personagem.
        public void SelecionandoPersonagem(){
        if(Escolha == 1){
            PersonagemCoins = 150;
        } else if(Escolha == 2){
            PersonagemCoins = 50;
        } else if (Escolha == 3){
            PersonagemCoins = 60;
        }
    }
    // Cria os personagem e verifica qual deles ele vai ser criado: Mago, Guerreiro ou Archer.
    public void AddPersonagem(){
        // Verifica qual personagem sera e se o player tem gold ou esta com o mouse na tela e se ele foi acionado.
        if(Escolha == 1 && Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null && coins >= PersonagemCoins){
            addObject(new Mago(),
                (Greenfoot.getMouseInfo().getX()/60) * 60 + 30,
                (Greenfoot.getMouseInfo().getY() / 60)* 60 +30);
            coins -= PersonagemCoins;
        } else if(Escolha == 2 && Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null && coins >= PersonagemCoins){
            addObject(new guerreiro(),
                (Greenfoot.getMouseInfo().getX()/60) * 60 + 30,
                (Greenfoot.getMouseInfo().getY() / 60)* 60 +30);
            coins -= PersonagemCoins;
        } else if(Escolha == 3 && Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null && coins >= PersonagemCoins){
            addObject(new Archer(),
                (Greenfoot.getMouseInfo().getX()/60) * 60 + 30,
                (Greenfoot.getMouseInfo().getY() / 60)* 60 +30);
            coins -= PersonagemCoins;
        }
    }
    // Reseta as variaveis
    public void DeNovo() {
        coins = 140;
        Horda = 1;
        PlayerHp = 100;
        Escolha = 1;
    }
    // Verifica se o player perdeu
    public boolean Derrota(){
        if(PlayerHp == 0){
            addObject(new GameOver(), 420, 300);
            return true;
        }else{
            return false;
        }
    }
    // Verifica se tem inimigos vivos dentro do mapa do jogo
    public boolean verificarPresencaInimigo() {
        List<Inimigos> inimigosNaPosicao = getObjects(Inimigos.class);
        return !inimigosNaPosicao.isEmpty();
    }
    // Cria inimigos.
    public void criandoInimigos() {
        // NR define qual imagem eles terao.
        int NR = random.nextInt(5) + 1;
        // Aki faz o spawn parar  se o player perder.
        if (PlayerHp == 0) {
            return;
        }
        // A cada 150 frames pode spawana um inimigos
        if (Time % 150 == 0) {
            //define um delay entre as hordas de inimigos para ficar mais leve o jogo.
            if (hordaDelay > 0) {
                hordaDelay--;
                // Cria os inimigos quando a horda tiver acabado e quando os inimigos não estiverem juntos
            } else if (enemyCreationDelay == 0 && enemyIndex <= Horda) {
                addObject(new Inimigos(NR), 1, 90); 
                enemyCreationDelay = 2; 
                enemyIndex++;
            }
        }
        if (enemyCreationDelay > 0) {
            enemyCreationDelay--;
        }
        // Define quando a Horda vai resetar e quando a Horda tempo de dalay a horda demoraria. 
        if (enemyIndex > Horda) {
            enemyIndex = 0;
            Horda++;
            hordaDelay = 4; 
        }
    }
}
