package org.example.legoprojekt.model;

public class InventoryEntry {
    private PartVariant  partVariant;
    private int Quantity;
    public InventoryEntry(PartVariant partVariant, int Quantity) {
        this.partVariant = partVariant;
        this.Quantity = Quantity;
    }

    public PartVariant getPartVariant() {
        return partVariant;
    }

    public int getQuantity() {
        return Quantity;
    }
}
