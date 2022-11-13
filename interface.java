import java.util.Scanner;
class LDL
{
    int ldlcount;
    LDL(int l){
        ldlcount=l;
    }
    void ldlreport()
    {
        if(ldlcount>=50 && ldlcount<=100)
        System.out.println("LDL normal");
        else
        System.out.println("LDL abnormal");
    }
}
interface HDL
{
    void hdlreport();
}
interface VLDL
{
    void vldlreport();
}
class cholesterol extends LDL implements HDL, VLDL
{
    int hdlcount;
    int vldlcount;
    cholesterol(int l,int h,int v)
    {
        super(l);
        hdlcount=h;
        vldlcount=v;
    }
 public void hdlreport(){
        if(hdlcount>=100 && hdlcount<=150)
        System.out.println("HDL normal");
        else
        System.out.println("HDL abnormal");
    }
  public void vldlreport()
    {
        if(vldlcount>=10 && vldlcount<=50)
        System.out.println("VLDL normal");
        else
        System.out.println("VLDL abnormal");
    }
    void totalchol()
    {
        System.out.println(ldlcount+hdlcount+vldlcount);
        ldlreport();
        hdlreport();
        vldlreport();
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        cholesterol o=new cholesterol(s.nextInt(),s.nextInt(),s.nextInt());
        o.totalchol();
    }

}
