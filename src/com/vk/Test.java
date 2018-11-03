package com.vk;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc = new Scanner(System.in);
		char ch;
		CharacterType cType;
		System.out.println("Enter any character");
		ch =sc.next().charAt(0);
		if(Character.isDigit(ch))
		{
			Class c = Class.forName("com.vk.ClassDigit");
			cType = (CharacterType)c.newInstance();
			printCharacterType(cType);			
		}
		else
		{
			Class c = Class.forName("com.vk.ClassAlpha");
			cType = (CharacterType)c.newInstance();
			printCharacterType(cType);	
		}

	}
	public static void printCharacterType(CharacterType characterType)
	{
		characterType.CharacterTypeMethod();
		
	}

}
