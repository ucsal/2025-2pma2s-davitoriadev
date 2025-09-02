package br.com.mariojp.solid.srp;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private final List<Item> items = new ArrayList<>();

	public void add(Item item) {
		items.add(item);
	}

	public List<Item> getItems() {
		return items;
	}
}
