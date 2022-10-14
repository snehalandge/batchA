package pkg1;

public class ReverseofWholeString {

	public static void main(String[] args) {
		
		String a="Logical programs are very easy";
		
		String k[]=a.split(" ");
		
		String SentenceReverse="";
		
		for(int i=0;i<k.length;i++)
			
		{
			String r=k[i];
			String ReverseString="";
			
			for(int j=r.length()-1;j>=0;j--)
			{
				ReverseString=ReverseString+r.charAt(j);
				
			}
			SentenceReverse=SentenceReverse+ReverseString+" ";
				
			
			}
		System.out.println(SentenceReverse);
		
		

	}

}
