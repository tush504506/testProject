package testPackage2;

public class testClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String OriginalName = "TuShar  @#123";
		int OriginalLength = OriginalName.length();
		
		char[] length= OriginalName.toCharArray();
		
		String noLetter = "";
		String noDigit = "";
		String noSpecialSymbol = "";
		int lengthspecialsymbol=0;
		
		for(char ch :length) {
			
			if(Character.isLetter(ch)) {
				noLetter=noLetter+ch;
				
			}
			if (Character.isDigit(ch)) {
				noDigit=noDigit+ch;
			}
			if(!(Character.isLetterOrDigit(ch))&& ch!=' ') {
				noSpecialSymbol=noSpecialSymbol+ch;
				lengthspecialsymbol++;
			}
			
		}
		
		System.out.println("Letter="+noLetter);
		System.out.println("Digit="+noDigit);
		System.out.println("noSpecialSymbol="+noSpecialSymbol);
		System.out.println(lengthspecialsymbol);
		
	}

}
