public class Knight extends King{
    protected void init() {
        this.power = rand(12, 2);
        this.hp = rand(21,2);
    }
    @Override
    public void kick(Character c){
        c.hp -= rand(this.power , 0);
        System.out.println("Knight: Lol, I'm even stronger than a King!! Take this!!");
    }
    public void myHp(){
        System.out.println("Knight: " + this.hp + " hp");
    }
}
