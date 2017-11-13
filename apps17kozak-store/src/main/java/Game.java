public class Game {
    protected String name;
    protected String genre;
    protected String description;
    protected double price;
    protected Object game_exe;
    public Game(String name, double price, String genre, String description, Object game_exe){
        this.name = name;
        this.price = price;
        this.genre = genre;
        this.description = description;
        this.game_exe = game_exe;
    }
    public String get_name(){
        return this.name;
    }
    public double get_price(){
        return this.price;
    }
    public String get_genre(){
        return this.genre;
    }
    public String get_description(){
        return this.description;
    }
    public Object getGame_exe() {
        return game_exe;
    }
    public void start_game(){
    }
}
