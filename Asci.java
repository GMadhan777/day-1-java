import java.util.Scanner;
class Asci{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a cahracter :");
        char ch=sc.next().charAt(0);
        int asci=ch ;
        System.out.println(asci);
    }
}