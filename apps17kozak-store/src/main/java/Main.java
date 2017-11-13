public class Main {
    public static void main(String[] args) {
        ComputerShop shop = new ComputerShop();
        shop.addGame("Hobbit", 15.4, "Shooter", "Funny Game", new Hobbit_Game());
        Game inst = shop.getGame("Hobbit");
        Hobbit_Game lol = (Hobbit_Game)inst.getGame_exe();
        lol.start_game();
    }
}
