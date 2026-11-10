 import java.util.Scanner;
 class Big{
    public static void main(String[] args){
    Scanner bt=new Scanner(System.in);
    int a;
    int b;
    int c;
    System.out.println("enter a value for a:");
    a=bt.nextInt();
    System.out.println("enter a value for b:");
    b=bt.nextInt();
    System.out.println("eneter a value for c:");
    c=bt.nextInt();
    if(a>=b && a>=c)
    System.out.println("a is biggset");
    else if(b<=a && b>=c)
    System.out.println(" b is biggest");
    else
    System.out.println("c is biggets");
    if(a<=b && a<=c)
    System.out.println("a is Smallet");
    else if(b<=a && b<=c)
    System.out.println(" b is smallest");
    else
    System.out.println("c is smallets");
    
  }
}