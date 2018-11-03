import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		CharacterType cType;
		System.out.println("Enter any character");
		ch =sc.next().charAt(0);
		if(Character.isDigit(ch))
		{
			cType = (CharacterType) new ClassDigit();
			printCharacterType(cType);			
		}
		else
		{
			cType = (CharacterType) new ClassAlpha();
			printCharacterType(cType);	
		}

	}
	public static void printCharacterType(CharacterType characterType)
	{
		characterType.CharacterTypeMethod();
		
	}

}
