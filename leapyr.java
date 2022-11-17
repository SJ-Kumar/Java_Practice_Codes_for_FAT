import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int year;
        year=s.nextInt();
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println("leap yr")
        }
        else{
            System.out.println("not a leap yr")
        }
    }
}
