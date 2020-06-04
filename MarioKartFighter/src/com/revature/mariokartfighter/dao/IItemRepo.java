package com.revature.mariokartfighter.dao;

import java.util.List;

import com.revature.mariokartfighter.models.Item;

public interface IItemRepo {
	public Item addItem(Item item);
	public List<Item> getAllItems();
}
