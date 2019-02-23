package Decoractor;

public class RebelSoldierDecorator extends BasicAttributes {
	
	public RebelSoldierDecorator (BasicAttributes rebel) {
		modelType = "Rebel Soldier";
		weaponType = "Blaster rifle";
		armorAmount = 100;
		healthLevel = 100;
	
	}

}
