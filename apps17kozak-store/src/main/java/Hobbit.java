public class Hobbit extends Character{
    protected void init() {
        this.power = 0;
        this.hp = 3;
    }
    @Override
    public void kick(Character c){
        toCry();
    }
    public void toCry() {
        System.out.println("Hobbit: Don't kick me, please!!");
    }
    public void myHp(){
        System.out.println("Hobbit: " + this.hp + " hp");
    }
}
