package Strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeAttack(int attack1, int attack2) {
		return strategy.attack(attack1, attack2);
	}
}
