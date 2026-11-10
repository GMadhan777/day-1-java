import java.util.Scanner;
class Odd{
    public static void main(String[] args){
    int n;
    Scanner od=new Scanner(System.in);
    System.out.println("enetr a val :");
    n=od.nextInt();
    if(n%2==0){
    System.out.println("even");}
    else{
    System.out.println("odd");}
    }
}