public class Hobbit_Game {
    CharacterFactory ch1;
    CharacterFactory ch2;
    GameManager game;
    public Hobbit_Game(){
        this.game = new GameManager();
        this.ch1 = new CharacterFactory();
        this.ch2 = new CharacterFactory();
    }
    public void start_game(){
        this.game.fight(this.ch1.createCharacter(),this.ch2.createCharacter());
    }
}
