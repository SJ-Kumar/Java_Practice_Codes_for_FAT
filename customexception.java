import java.util.Scanner;
class MarkException extends Exception{
    int mark;
    MarkException(int m){ 
        mark=m;
    }
    public String toString(){
        return mark+" out of range 0-100";
    }
}
class CustomExceptionDemo{
    public static void check(int m)throws MarkException{
        if(m<0 || m>100)
        throw new MarkException(m);
        else if(m>=50)
        System.out.println("passed");
        else
        System.out.println("failed");
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter marks:");
        int mark=s.nextInt();
        try
        {
            check(mark);
        }
        catch(MarkException e)
        {
            System.out.println(e);
        }
        System.out.println(new java.util.Date());
    }
}
