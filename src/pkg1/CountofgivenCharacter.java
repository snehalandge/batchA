package pkg1;

public class CountofgivenCharacter {

	public static void main(String[] args) {
		
		
		String a="Logical programs are very easy";
		
		char k='e';
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==k)
				count=count+1;
			
			
		}
			System.out.println(count);
		
		

	}

}
