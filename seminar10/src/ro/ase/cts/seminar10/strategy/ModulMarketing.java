package ro.ase.cts.seminar10.strategy;

public class ModulMarketing {

	private MarketingStrategyInterface currentStrategy;

	public void setCurrentStrategy(MarketingStrategyInterface currentStrategy) {
		this.currentStrategy = currentStrategy;
	}
	
	public double getBonus(double base) {
		if(currentStrategy != null) {
			return currentStrategy.calculateBonus(base);
		} else {
			throw new UnsupportedOperationException();
		}
	}
}
