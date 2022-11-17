import java.util.Scanner;
class game{
    int playerid;int dice;int score;
    game(){
        playerid=0;
        dice=1;
        score=0;
    }
    game(int id,int d){
        playerid=id;
        dice=d;
        if(dice==6){
            System.out.println("game started");
        }
        else{
            System.out.println("try next num");
        }
    }
    game(int id,int d,int s){
        playerid=id;
        dice=d;
        score=s;
    }
}
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        game g0=new game();
        g0.playerid=s.nextInt();
        g0.dice=s.nextInt();
        g0.score=s.nextInt();
        System.out.println(g0.playerid);
        System.out.println(g0.dice);
        System.out.println(g0.score);
        
        game g1=new game();
        System.out.println(g1.playerid);
        System.out.println(g1.dice);
        System.out.println(g1.score);
        
        game g2=new game(1,4);
        System.out.println(g2.playerid);
        System.out.println(g2.dice);
        System.out.println(g2.score);
        
        game g3=new game(1,6);
        System.out.println(g3.playerid);
        System.out.println(g3.dice);
        System.out.println(g3.score);
        
        game g4=new game(2,4,16);
        System.out.println(g4.playerid);
        System.out.println(g4.dice);
        System.out.println(g4.score);
        
        game g5=new game(3,3,6);
        System.out.println(g5.playerid);
        System.out.println(g5.dice);
        System.out.println(g5.score);
        
        
    }
}
