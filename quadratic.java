import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        double d=(b*b-4*a*c);
        if(d>0.0){
            double r1=(-b+Math.pow(d,0.5))/(2*a);
            double r2=(-b-Math.pow(d,0.5))/(2*a);
            System.out.println(r1);
            System.out.println(r2);
            
        }
        else if(d==0.0){
            double r1=(-b/2*a);
            System.out.println(r1);
        }
        else{
            System.out.println("roots are not real");
        }
        
    
    
    }
}
