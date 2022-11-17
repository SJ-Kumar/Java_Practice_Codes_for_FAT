import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int shape;
        shape=s.nextInt();
        switch(shape){
            case 1:
                double r;
                r=s.nextDouble();
                double sum = 3.14*r*r;
                System.out.println("area of circle is"+sum);
                break;
            default:
            System.out.println("invalid shape");
            break;
                
        }
        
    
    
    }
}
