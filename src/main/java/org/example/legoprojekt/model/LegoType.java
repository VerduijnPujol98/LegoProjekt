package org.example.legoprojekt.model;

public class LegoType {
    private String name;
    private String shape;
    private int length;
    private int width;

    public LegoType(String name, String shape, int length, int width) {
        this.name = name;
        this.shape = shape;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape;
    }
}
