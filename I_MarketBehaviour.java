package lession_2;

interface I_MarketBehaviour<T> {
	void acceptOrder(T order);
	T deliverOrder();
}