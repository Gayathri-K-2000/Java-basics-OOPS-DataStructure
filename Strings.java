public class Strings{
    public static void main(String args[]){
        String str1="i am good";
        String str2="iam great";
        System.out.println(str1.length());
        System.out.println(str1.equals(str2));
        System.out.println(str1.charAt(3));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.replace("good","I am superb"));
        System.out.println(str2.trim());
        System.out.println(str1.concat(" person"));
       
        
        //Strings are immutable:  example: its not possible to write as---str1.append("person")
        //In this case,  we can use string buffer and string StringBuilder
        
        StringBuilder str= new StringBuilder("HELLO");
        str.append(" WORLD");
        System.out.println(str);
    }
}
