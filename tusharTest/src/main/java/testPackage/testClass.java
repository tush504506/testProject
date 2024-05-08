package testPackage;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String OriginalName="PrakasH";
		int Length = OriginalName.length();
		char chh;
		
		String ReverseName="";
		
		
		
		for(int i=0; i<Length; i++){
			
		char ch = OriginalName.charAt(i);
		if(Character.isLowerCase(ch)){
			chh = Character.toUpperCase(ch);
			ReverseName=ReverseName+chh;
		}
		if (Character.isUpperCase(ch)) {
			chh = Character.toLowerCase(ch);
			ReverseName=ReverseName+chh;
		}		
	
	    }
		
       System.out.println(ReverseName);
		
		
	}

}
