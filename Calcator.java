import java.util.Scanner;
class Add{
    Add(int a,int b){
        System.out.println("add"+(a+b));
    }
}
    class Sub{
        Sub(int a,int b){
        System.out.println("Sub"+(a-b));
    }
}
    class Mul{
    Mul(int a,int b){
        System.out.println("Mul"+(a*b));
    }
    }
    class Div{
    Div(int a,int b){
        System.out.println("Div"+(a/b));
    }

}
class Calcator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.print("enetr a value a:");
        a=sc.nextInt();
        System.out.println("enter a value b :");
        b=sc.nextInt();
        Add ad=new Add(a,b);
        Sub sb=new Sub(a,b);
        Mul ml=new Mul(a,b);
        Div dv=new Div(a,b);

    }
}