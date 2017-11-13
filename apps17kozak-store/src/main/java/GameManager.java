public class GameManager{
    public static void fight(Character c1, Character c2){
        c1.init();
        c2.init();
        while(c1.hp > 0 && c2.hp > 0){
            c1.myHp();
            c2.myHp();
            c1.kick(c2);
            c2.kick(c1);
        }
        System.out.println("--- The End ---");
        c1.myHp();
        c2.myHp();
    }
}
