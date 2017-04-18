package com.agentecon.production;

import com.agentecon.production.IPriceProvider;
import com.agentecon.good.Good;
import com.agentecon.good.Inventory;

public interface IProductionFunction {

	public Good[] getInput();
	
	public double[] getWeights();

	public Good getOutput();

	public double produce(Inventory inventory);
	
	public double getCostOfMaximumProfit(IPriceProvider prices);
	
	public double getExpenses(Good good, double price, double totalSpendings);
	
}
