import java.util.Scanner;
abstract class tourpackage
{
    int commuting;
    int stay;
    abstract void packagecost();
}
class luxury extends tourpackage
{
    int cab;
    int guide;
    int refreshment;
    luxury(int c, int s, int ca,int g,int r)
    {
        commuting=c;
        stay=s;
        cab=ca;
        guide=g;
        refreshment=r;
    }
    void packagecost()
    {
        int t=(commuting+cab+guide+refreshment)*stay;
        int v=(t/100)*10;
        System.out.println(t+v);
    }
}
class economy extends tourpackage
{
    int movie;
    economy(int c,int s,int m)
    {
        commuting=c;
        stay=s;
        movie=m;
    }
    void packagecost()
    {
        int t=(commuting+movie)*stay;
        int v=(t/100)*5;
        System.out.println(t+v);
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        tourpackage t;
        t=new luxury(20000,3,100,100,100);
        t.packagecost();
        t=new economy(10000,3,100);
        t.packagecost();
    }
}
