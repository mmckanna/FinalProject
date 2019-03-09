package Decoractor;

public class RebelSoldierDecorator extends BasicAttributes {
	
	public RebelSoldierDecorator (BasicAttributes rebel) {
		modelType = "Rebel Soldier";
		weaponType = "blaster rifle";
		healthLevel = 100;
	}
}
