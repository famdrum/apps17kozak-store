public class Character {
    int power;
    int hp;
    protected void init() {
    }
    public void kick(Character c){
        System.out.println("Take this");
    }
    public boolean isalive(){
        if (hp > 0) {
            System.out.println("Sure, I am!!");
            return  true;
        }else{
            System.out.println("Nope, I'm dead(((");
            return  false;
        }
    }
    public void myHp(){
    }
}
