package Factory;

public class CreateCharacter {
	
	CharacterFactory factory;
	 
	public CreateCharacter(CharacterFactory factory) { 
		this.factory = factory;
	}
 
	public Character createCharacter(String type) {
		Character character;
 
		character = factory.createCharacter(type);
 
		character.getCharacterType();
		
		return character;
	}

}
