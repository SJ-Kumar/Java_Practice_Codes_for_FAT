import java.util.Scanner;
class account
{
    int ano;
    int pwd;
    account(int a,int p)
    {
        ano=a;
        pwd=p;
    }
   int saver(){
        return ano+pwd;
       
   }
}
class eaccount extends account
{
    int pwd;
    eaccount(int a,int p,int p1){
        super(a,p);
        pwd=p1;

    }
    int saver(){
        return(super.saver()+super.pwd)*pwd;
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        eaccount e=new eaccount(s.nextInt(),s.nextInt(),s.nextInt());
        System.out.println(e.saver());
        
    }
}
