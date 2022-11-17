import java.io.*;
import java.util.Scanner;

class Mark implements Serializable{
    String n;
    int i1,i2,i3;
    Mark(String n,int i1,int i2,int i3){
        this.n=n;
        this.i1=i1;
        this.i2=i2;
        this.i3=i3;
    }
    void status(){
        int total=i1+i2+i3;
        if(total>=150){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}

class Main{
    public static void main(String args[]){
        try{
            Scanner s=new Scanner(System.in);
            Mark aobj=new Mark(s.next(),s.nextInt(),s.nextInt(),s.nextInt());
            FileOutputStream fos=new FileOutputStream("output1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(aobj);
            oos.flush();
            oos.close();
            
            FileInputStream fis=new FileInputStream("output1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Mark x=(Mark)ois.readObject();
            ois.close();
            fis.close();
            
            System.out.println(x.n);
            System.out.println(x.i1);
            System.out.println(x.i2);
            System.out.println(x.i3);
            x.status();
        
        }
        catch(Exception e){
            System.out.println(e);
        }
}
}
