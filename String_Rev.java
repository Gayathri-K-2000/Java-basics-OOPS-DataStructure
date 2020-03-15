public class String_Rev
{
	public static void main(String[] args) {
	    
	    String str= "Hello";
	    
	    char chars[]=str.toCharArray();
	    for(int i= chars.length-1;i>=0;i--){
	        System.out.println(chars[i]);
	    }
		
	}
}
