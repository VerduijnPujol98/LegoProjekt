package org.example.legoprojekt.model;

import java.util.ArrayList;

public class InventoryList {
    private ArrayList<InventoryEntry> inventory;
    public InventoryList() {
        this.inventory = new ArrayList<>();
    }

    public void add(InventoryEntry inventoryEntry) {
        this.inventory.add(inventoryEntry);
    }

    public ArrayList<InventoryEntry> getInventory() {
        return inventory;
    }


}
