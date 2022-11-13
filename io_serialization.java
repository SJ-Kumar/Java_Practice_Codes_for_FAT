import java.io.*;
class a implements Serializable
{
    String n;
    int i;
    a(String n, int i)
    {
    this.n = n;
    this.i = i;
    }
}
class b
{
    public static void main(String[] args)
    {
      try
      {
     a aobj = new a("zing", 104);
     FileOutputStream fos = new FileOutputStream("output1.txt");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(aobj);
     oos.flush();
     oos.close();

FileInputStream fis = 
	         new FileInputStream("output1.txt");
	         ObjectInputStream ois = new ObjectInputStream(fis);
        a  x = (a) ois.readObject();
 
	         ois.close();
	         fis.close();
 
	         System.out.println(x.n);
	         System.out.println(x.i);
	                 }
       catch (Exception e) {  System.out.println(e);     }
    }
}
