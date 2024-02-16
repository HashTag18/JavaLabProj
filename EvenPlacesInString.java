package ClgLabProj;

public class EvenPlacesInString {
	
	public static void main (String[] args) {
		
		String a="They were not meant to be Together.";
		
		System.out.println("The Characters at even Places are : ");
		
		for (int i=0;i<a.length();i++) {
			
		if(i%2==0) {
			char y=a.charAt(i);
			System.out.print(y);
			}
		}
		
		System.out.println(" \n The Characters at odd Places are : ");
		
		for (int i=0;i<a.length();i++) {
			
		if(i%2!=0) {
			char y=a.charAt(i);
			System.out.print(y);
			}
		}
		
		
	}
}
