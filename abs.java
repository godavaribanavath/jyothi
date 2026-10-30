abstract class parent{
     public  abstract void feed();
     public void show1(){
        System.out.println("hai hello yaar!");
     }
}
 class child extends parent{
     public  void feed(){
        System.out.println("im gfrom child yaar!");
     }
     public void  show(){
        System.out.println("hai hello yaar this is child !");
     }
}
public class abs{
    public static void  main(String args[]){
        parent p=new child();
        child c=new child();
        p.show1();
      
         c.show();
        c.feed();



    }
}
