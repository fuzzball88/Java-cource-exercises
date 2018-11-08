import java.util.Scanner;
public class CharacterStrings {
    public static void main(String args[]) {
        String characterString;
        Scanner reader = new Scanner(System.in);

        Printer printerObject = new Printer();

        System.out.print("Type in a character string: ");
        characterString = reader.nextLine();

        characterString = printerObject.bigSmall(characterString);
        printerObject.reverseSpace(characterString);
    }
}

class Printer{

	public static String bigSmall(String word){
		Scanner reader = new Scanner(System.in);
		System.out.println("Do you want upper case or lower case? (upper/lower): ");
		String uplow = reader.nextLine();
		if("upper".equalsIgnoreCase(uplow)){
			return word.toUpperCase();
		}
		else if("lower".equalsIgnoreCase(uplow)){
			return word.toLowerCase();
		}
		else
			return word;
	}

	public void reverseSpace(String word){
		Scanner reader = new Scanner(System.in);
		System.out.println("How would you like the string to be printed? (reverse/separated): ");
		String resa = reader.nextLine();
		if("reverse".equalsIgnoreCase(resa)){
			System.out.println("Here is your character string: "+new StringBuilder(word).reverse().toString());
		}
		
		else if("separated".equalsIgnoreCase(resa)){
			System.out.print("Here is your character string: ");
			for(int i = 0;i<word.length();i++){
			System.out.print(word.charAt(i)+" ");
			}
			
		}
	}
}
