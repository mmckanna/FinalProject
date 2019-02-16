package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Decoractor.BasicAttributes;
import Decoractor.BasicCharacter;
import Decoractor.StormtrooperDecorator;
import Factory.Character;
import Factory.CharacterFactory;
import Factory.CreateCharacter;
import Factory.Jedi;
import Factory.RebelSoldier;
import Factory.Sithlord;
import Factory.Stormtrooper;
class Testing {

	@Test
	void test() {
		
		//Creates a character.
		CharacterFactory factory = new CharacterFactory();
		CreateCharacter create = new CreateCharacter(factory);
		
		Character character = create.createCharacter("Rebel Soldier");
		System.out.println(character);
		System.out.println("\n" + "Deploying your " + character.getCharacterType() + " for battle.\n");
	}
	
}
