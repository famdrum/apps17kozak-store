import java.lang.Math;

public class King extends Character{
    protected void init() {
        this.power = rand(15, 5);
        this.hp = rand(15,5);
    }
    protected int rand(int max, int min){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    @Override
    public void kick(Character c){
        c.hp -= rand(this.power , 0);
        System.out.println("King: Prepare yourself!!");
    }
    public void myHp(){
        System.out.println("King: " + this.hp + " hp");
    }
}
