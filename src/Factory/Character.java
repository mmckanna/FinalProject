package Factory;

public class Character {
	
	static String characterType= "";

	public String getCharacterType() {
		return characterType;
	}

	public String toString() {
		
		StringBuffer display = new StringBuffer();
		display.append("You have selected: " + characterType + ". " + "Prepare for battle");	
			
		return display.toString();
	}
}


