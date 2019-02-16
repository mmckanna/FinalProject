package Decoractor;

public class RebelSoldierDecorator extends BasicAttributes {
	
	public RebelSoldierDecorator (Character character) {
		modelType = "Jedi";
		weaponType = "Lightsaber";
		armorAmount = 100;
		healthLevel = 100;
	
	}

}
