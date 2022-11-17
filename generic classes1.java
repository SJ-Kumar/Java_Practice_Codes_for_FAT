import java.util.Scanner;

class Salary{
    String name;
    Salary(String n){
        name=n;
    }
}
class crypto extends Salary{
    int coins;
    crypto(String n,int c){
        super(n);
        coins=c;
    }
}
class bitcoin extends crypto{
    bitcoin(String n,int coins){
        super(n,coins);
    }
}
class ether extends crypto{
    ether(String n,int coins){
        super(n,coins);
    }
}
class inr extends Salary{
    int amount;
    inr(String n,int a){
        super(n);
        amount=a;
    }
}
class SalarySlip<T extends crypto>{
    T S;
    SalarySlip(T p){
        S=p;
    }
    T get(){
        return S;
    }
}
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        SalarySlip<bitcoin>x=new SalarySlip<>(new bitcoin(s.next(),s.nextInt()));
        SalarySlip<ether>x1=new SalarySlip<>(new ether(s.next(),s.nextInt()));
        System.out.println(x.get().name);
        System.out.println(x.get().coins);
        System.out.println(x1.get().name);
        System.out.println(x1.get().coins);
    }
}
