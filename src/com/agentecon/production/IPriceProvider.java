package com.agentecon.production;

import com.agentecon.goods.Good;

public interface IPriceProvider {

	public double getPrice(Good output);

}
