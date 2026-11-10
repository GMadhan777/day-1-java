class Lap{
    String ram="32gb";
    String brand="hp";
    void bootup(){
     System.out.println("loptop is starting");}
     }
class Laptop{
    public static void main(String[] args){
        Lap lp= new Lap();
        System.out.println(lp.ram);
        System.out.println(lp.brand);
        lp.bootup();
    }
}