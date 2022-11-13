import java.util.Scanner;
class stitching
{
    int strd;
    stitching(int s){strd=s;}
    int scost(){
        if(strd>=1 && strd<=5)
        return 100;
        else
        return 200;
    }
}
interface material
{
    public int mcost();
}
interface cutting
{
    public int ccost();
}
class total extends stitching implements material,cutting
{
    int length;
    int gender;
    total(int s,int l,int g)
    {
        super(s);
        length=l;
        gender=g;
    }
    public int mcost()
    {
        return length*50;
    }
    public int ccost()
    {
        if(gender==0)
        return 50;
        else 
        return 100;
    }
    int tcost(){return scost()+mcost()+ccost();}
}
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        total o=new total(s.nextInt(),s.nextInt(),s.nextInt());
        System.out.println(o.tcost());
    }
}
