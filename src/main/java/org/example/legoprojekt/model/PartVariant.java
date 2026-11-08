package org.example.legoprojekt.model;

public class PartVariant {
    private String partName;
    private String partSize;
    private String partShape;
    private Color color;
    public PartVariant(String partSize, String partShape, Color color) {
        this.partName =color.getColorName() + " " +  partSize + " " + partShape + " ";
        this.partSize = partSize;
        this.partShape = partShape;
        this.color = color;
    }


    public String getPartName() {
        return partName;
    }
    public String getColor() {
        return color.getColorName();
    }


    @Override
    public String toString() {
        return color.getColorName() + " " + partSize + " " + partShape;
    }
}
