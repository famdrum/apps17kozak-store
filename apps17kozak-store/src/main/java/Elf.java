public class Elf extends Character{
    protected void init() {
        this.power = 10;
        this.hp = 10;
    }
    @Override
    public void kick(Character c){
        if (c.power < this.power) {
            System.out.println("Elf: Astalavista");
            c.hp = 0;
        }else{
            System.out.println("Elf: I think you need more practise. -1 hp!");
            c.hp -= 1;
        }
    }
    public void myHp(){
        System.out.println("Elf: " + this.hp + " hp");
    }
}
