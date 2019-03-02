package TestCases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.net.*;
import javax.swing.*;
import java.util.*;
import Decoractor.*;
import Factory.*;
import Factory.Character;
import Proxy.*;
import Strategy.*;


class Testing {

	@Test
	void Test() {
		//Tests the Factory, Decorator, and Strategy design patterns.		
		int defaultEnemyHP = 100;
		
		//Creates a character using the Factory Design Pattern
		CharacterFactory factory = new CharacterFactory();
		CreateCharacter create = new CreateCharacter(factory);
				
		Character characterType = create.createCharacter("Stormtrooper");
		System.out.println(characterType);
		System.out.println("\n" + "Deploying your " + characterType.getCharacterType() + " for battle.\n");
		
						
		//Adds attributes to the selected character using the Decorator Design Pattern.
		BasicAttributes character = new BasicCharacter();
				
		BasicAttributes stormtrooper = new StormtrooperDecorator(character);
		System.out.println("Weapon Type: " + stormtrooper.getWeaponType() + "\n\n" + "Health Amount: " + stormtrooper.getHealthLevel() + "\n");
						
		System.out.println("Prepare for battle...\n");
		
		//Simulates a battle between the selected player and the default enemy using the Strategy Design Pattern.
		Context context = new Context(new RegularAttack());
		System.out.println(stormtrooper.getModelType() + " attacks another player with " + stormtrooper.getWeaponType() + ".\n" + "\nResult of the attack leaves the " + stormtrooper.getModelType() +" with " + 
							context.executeAttack(stormtrooper.getHealthLevel(), defaultEnemyHP) + " HP.");
		
	}
	
}

