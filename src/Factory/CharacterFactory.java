package Factory;

public class CharacterFactory {
	

	public Character createCharacter(String type) {
		Character character = null;

		if (type.equals("Stormtrooper")) {
			character = new Stormtrooper();
		} else if (type.equals("Sithlord")) {
			character = new Sithlord();
		} else if (type.equals("Rebel Soldier")) {
			character = new RebelSoldier();
		} else if (type.equals("Jedi")) {
			character = new Jedi();
		}
		return character;
	}
}
