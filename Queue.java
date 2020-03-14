
import java.util.*;
public class Queue{
    public static void main(String args[]){
        Queue<Integer> s=new LinkedList<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        System.out.println(s);
        s.remove(20);
        System.out.println(s);
        
        
    }
}
