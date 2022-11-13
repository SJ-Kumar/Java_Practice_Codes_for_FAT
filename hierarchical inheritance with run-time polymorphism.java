import java.util.Scanner;
abstract class order
{
    int weight;
    int qty;
    abstract void price();

}
class square extends order
{
    square(int w,int q){
        weight=w;
        qty=q;
    }
    void price(){
        System.out.println(weight*qty*50);
    }
}
class circle extends order
{
     circle(int w,int q){
        weight=w;
        qty=q;
    }
    void price(){
        System.out.println(weight*qty*100);
    }
}
class custom extends order
{
     custom(int w,int q){
        weight=w;
        qty=q;
    }
    void price(){
        System.out.println(weight*qty*200);
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        order o;
        o=new square(5,5);
        o.price();
        o=new circle(4,4);
        o.price();
        o=new custom(3,3);
        o.price();
    }
}
