package Decoractor;

public abstract class CharacterDecorator extends BasicAttributes {
	
	public abstract String getModelType();
	public abstract String getWeaponType();
	public abstract int getArmorAmount();
	public abstract int getHealthLevel();

}
