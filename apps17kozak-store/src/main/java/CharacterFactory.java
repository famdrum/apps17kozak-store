import java.lang.Math;

public class CharacterFactory {
    Hobbit hobbit = new Hobbit();
    Elf elf = new Elf();
    King king = new King();
    Knight knight = new Knight();
    Character characters[] = {hobbit, elf, king, knight};
    public Character createCharacter(){
        return characters[(int) (Math.random() * characters.length)];
    }
}