import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ComputerShop {
    private List games_list;
    public ComputerShop(){
        games_list = new LinkedList();
    }
    public void addGame(String name, double price, String genre, String description, Object game_exe){
        Game new_game = new Game(name, price, genre, description, game_exe);
        games_list.add(new_game);
    }
    public Game getGame(String name){
        for(Iterator i = games_list.iterator(); i.hasNext();){
            Game game = (Game)i.next();
            if(game.get_name().equals(name)){
                return game;
            }
        }
        return null;
    }
    public boolean searchGame(String name){
        for(Iterator i = games_list.iterator(); i.hasNext();) {
            Game game = (Game) i.next();
            if (game.get_name().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
