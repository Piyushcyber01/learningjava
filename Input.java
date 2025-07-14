import java.util.*;

class Input{
public static void main(String[] args){
        
    Scanner Obj=new Scanner(System.in);

    System.out.println("enter integer");
    int a=Obj.nextInt();

    System.out.println("enter character");
    Character c=Obj.next().charAt(0);


    System.out.println("enter float");
    Float f=Obj.nextFloat();


    System.out.println("enter double");
    Double d=Obj.nextDouble();

    Obj.nextLine();
    
    System.out.println("enter string");
    String s=Obj.nextLine();

    }
    
}
