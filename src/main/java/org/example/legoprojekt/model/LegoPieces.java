package org.example.legoprojekt.model;

public class LegoPieces {
    private String color;
    private LegoType type;


    public LegoPieces(String name, String color, LegoType type) {
        this.color = color;
        this.type = type;
    }

    public LegoPieces() {

    }

    public String getColor() {
        return color;
    }

    public LegoType getType() {
        return type;
    }

}
