package org.example.legoprojekt.model;

public class Color {
    private String name;
    private int colorId;

    public Color(String name, int colorId) {
        this.name = name;
        this.colorId = colorId;
    }

    public String getColorName() {
        return name;
    }
}
