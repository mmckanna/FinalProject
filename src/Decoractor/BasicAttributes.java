package Decoractor;

public abstract class BasicAttributes {
	
	static String modelType = "Default Stromtrooper ";
	static String weaponType = "with standard weapons. ";
	static int healthLevel = 100;
	
	public String getModelType() {
		return modelType;
	}
	
	public String getWeaponType() {
		return weaponType;
	}
	
	public int getHealthLevel() {
		return healthLevel;
	}
	
}
