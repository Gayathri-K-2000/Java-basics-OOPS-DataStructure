import java.util.*;
import java.util.Arrays;
public class Array{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY LENGTH:  ");
        int length=in.nextInt();
        String[] input=new String[length];
        
        System.out.println("ENTER THE ARRAY ELEMENTS:  ");
        
        for(int i=0;i<length;i++){
            String arr=in.next();
            input[i]=arr;
        }
        
        System.out.println("THE ARRAY ELEMENTS ARE:  "+Arrays.toString(input));
        
    }
}
