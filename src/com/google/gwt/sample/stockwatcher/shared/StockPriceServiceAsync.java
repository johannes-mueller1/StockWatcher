package com.google.gwt.sample.stockwatcher.shared;

import com.google.gwt.sample.stockwatcher.shared.bo.StockPrice;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StockPriceServiceAsync {

	void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);

}
