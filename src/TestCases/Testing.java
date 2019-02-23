package TestCases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.net.*;
import javax.swing.*;
import java.util.*;
import Decoractor.*;
import Decoractor.CharacterInterface;
import Decoractor.RebelSoldierDecorator;
import Factory.*;
import Factory.Character;
import Proxy.*;
import Proxy.CharacterComponent;



class Testing {

	@Test
	void TestFactory() {
		
		//Creates a character.
		CharacterFactory factory = new CharacterFactory();
		CreateCharacter create = new CreateCharacter(factory);
		
		Character characterType = create.createCharacter("jedi");
		System.out.println(characterType);
		System.out.println("\n" + "Deploying your " + characterType.getCharacterType() + " for battle.\n");
	}
	
	@Test
	void TestDecorator() {
		
		BasicAttributes character = new BasicCharacter();
				
				
		BasicAttributes sithlord = new SithlordDecorator(character);
		System.out.println("Model Type: " + character.getModelType() + "\n" + "Weapon Type: " + character.getWeaponType() + "\n" + 
				"Armor Amount: " + character.getArmorAmount() + "\n" + "Health Amount: " + character.getHealthLevel() + "\n");
		
				
		System.out.println("Prepare for battle...");
		
	}
}

