class Animal{
    float weight=65;
    String colour="balck";
    Double height=6.5; 
    void sound(){
     System.out.println("mememe");}
     void behaviour(){
     System.out.println("wild");
    }
}
class Goat{
    public static void main(String[] args){
        Animal an= new Animal();
        System.out.println(an.weight);
        System.out.println(an.colour);
        System.out.println(an.height);
        an.sound();
        an.behaviour();
    }
}