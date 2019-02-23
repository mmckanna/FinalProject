package Decoractor;

public class StormtrooperDecorator extends BasicAttributes {
	
	public StormtrooperDecorator (BasicAttributes stormtrooper) {
		modelType = "Stromtrooper";
		weaponType = "Blaster";
		armorAmount = 150;
		healthLevel = 150;
	
	}

}
