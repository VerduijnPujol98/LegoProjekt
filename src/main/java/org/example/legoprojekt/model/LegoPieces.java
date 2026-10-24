package org.example.legoprojekt.model;

public class LegoPieces {
    private String color;
    private LegoType type;


    public LegoPieces(String color, LegoType type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public LegoType getType() {
        return type;
    }
}
