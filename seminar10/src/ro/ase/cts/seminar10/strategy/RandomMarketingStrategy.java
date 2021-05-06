package ro.ase.cts.seminar10.strategy;

import java.util.Random;

public class RandomMarketingStrategy implements MarketingStrategyInterface{

	@Override
	public double calculateBonus(double base) {
		Random random = new Random();
		return random.nextInt(100) * base;
	}

}
