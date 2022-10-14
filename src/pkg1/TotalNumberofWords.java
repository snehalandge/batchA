package pkg1;

public class TotalNumberofWords {

	public static void main(String[] args) {
		
		String a="My name is sneha";
		
		int count=0;
		
		for(int i=0;i<a.length();i++)
		{
			
			if(a.charAt(i)!=' ')
			{
				count=count+1;
				
			}
			
		}
		
		System.out.println("number of words in the string are : " +count);
		
		

	}

}
