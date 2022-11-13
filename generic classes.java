import java.util.Scanner;
class Continent
{
    String name;
    Continent(String n){name=n;}
}
class Asia extends Continent
{
    int gdp;
    Asia(String n,int n1){super(n); gdp=n1;}
}
class East extends Asia{East(String n,int n1){super(n,n1);}}
class West extends Asia{West(String n,int n1){super(n,n1);}}
class Europe extends Continent
{
    int gdp;
    Europe(String n,int n1){super(n); gdp=n1;}
}
class Survey <T extends Asia>
{
    T S;
    Survey(T p){S=p;}
    T get(){return S;}
}
class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		Survey<West> x=new Survey<>(new West(s.next(),s.nextInt()));
		Survey<East> x1=new Survey<>(new East(s.next(),s.nextInt()));
		System.out.println(x.get().name);
		System.out.println(x.get().gdp);
		System.out.println(x1.get().name);
		System.out.println(x1.get().gdp);
	}
}
