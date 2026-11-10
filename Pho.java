class Smartph{
    String model="oppf14";
    String storage="64gb";
    String os="andriod 16";
    void takephoto(){
     System.out.println("click photo captured");}
     void browser(){
        System.out.println("loading website");
     }
 }
class Pho{
    public static void main(String[] args){
        Smartph sp= new Smartph();
        System.out.println(sp.model);
        System.out.println(sp.storage);
        System.out.println(sp.os);
        sp.takephoto();
        sp.browser();
    }
}