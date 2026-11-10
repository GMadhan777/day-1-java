class Employee{
    String name="ravi";
    double id=22355;
    void work(){
     System.out.println("writeing code");}
     void get_bonus(){
        System.out.println("u got bonus");
     }
}

class Emp{
    public static void main(String[] args){
        Employee ep= new Employee();
        System.out.println(ep.name);
        System.out.println(ep.id);
        ep.work();
        ep.get_bonus();
    }
}