package org.example.legoprojekt.model;

import java.util.ArrayList;

public class Model {
    private int id;
    private String name;
    private ArrayList<RequiredPieces> requiredPieces;

    public Model(int id, String name, ArrayList<RequiredPieces> requiredPieces) {
        this.id = id;
        this.name = name;
        this.requiredPieces = requiredPieces;
    }

    public void addRequiredPieces(RequiredPieces requiredPieces) {
        this.requiredPieces.add(requiredPieces);
    }
}
