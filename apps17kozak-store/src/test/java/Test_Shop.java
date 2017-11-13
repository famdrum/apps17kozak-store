import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Shop {
    public static void main(String[] args) {
        ComputerShop shop = new ComputerShop();
        Hobbit_Game test = new Hobbit_Game();
        shop.addGame("Hobbit", 15.4, "Shooter", "Funny Game", test);
        Game inst = shop.getGame("Hobbit");
        assertEquals(test, shop.getGame("Hobbit").getGame_exe());
        assertEquals("Hobbit", shop.getGame("Hobbit").get_name());
        assertEquals(15.4, shop.getGame("Hobbit").get_price());
        assertEquals("Shooter", shop.getGame("Hobbit").get_genre());
        assertEquals("Funny Game", shop.getGame("Hobbit").get_description());
        assertEquals(true, shop.searchGame("Hobbit"));
        Hobbit_Game lol = (Hobbit_Game)inst.getGame_exe();
        lol.start_game();
    }
}
