import java.util.ArrayList;

class Capgemini {
    protected static int a;
    public Capgemini(int x){
        a=x;
    }

    public Capgemini() {
        
    }
}

 class Toy {
     public static void main(String []args)
     {
         new Capgemini();
         StringBuffer sb = new StringBuffer("Welcome to ");
         sb.append("StackHowTo!");
         System.out.println(sb.toString());
     }
 }