
import java.util.Scanner;

class Product{
    int pid;
    String name;
    int price;
    Product(){
        System.out.println("Product object constructed...");
    }
    
    void setDetails(int pid, String name, int price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    
}

class LEDTV extends Product{
     
    void led(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of ledTV:  ");
        int size= in.nextInt();
        System.out.println("--------PRODUCT ID: "+pid+"---------");
        
        System.out.println("--PRODUCT NAME: "+name);
        System.out.println("--PRICE: Rs."+price);
        System.out.println("--Size of LEDTV:  "+size+" inches");
        
        
    }
    
}

public class Inheritance{
   
    public static void main(String args[]){
        
        LEDTV ob=new LEDTV();
        
        ob.setDetails(111,"TV",45000);
        ob.led();
        
    }
}
