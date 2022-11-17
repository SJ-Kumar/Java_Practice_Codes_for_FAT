import java.util.Scanner;
class Sum{
    int n1,n2,n3;
    Sum(int n1,int n2,int n3){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
    }
    void pyth(){
        if((n3*n3)==n1*n2){
            System.out.println("satisfies");
        }
        else{
            System.out.println("doesnt satisfies");
        }
        
        
    }
    
}
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Sum x =new Sum(s.nextInt(),s.nextInt(),s.nextInt());
        x.pyth();
        
    }
}
