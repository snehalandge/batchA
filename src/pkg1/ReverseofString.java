package pkg1;

public class ReverseofString {

	public static void main(String[] args) {
		
		
	String a= "Logical";
	
    String ReverseString="";
    
    for(int i=(a.length()-1);i>=0;i--)
    {
    	ReverseString=ReverseString+a.charAt(i);
    	
    	
    }
    System.out.println(ReverseString);
		

	}

}
