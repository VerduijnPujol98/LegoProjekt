package org.example.legoprojekt.model;

import java.util.ArrayList;
import java.util.List;

public class LegoSet {
    private String setNummer;
    private String name;
    private List<LegoPieces> pieces = new ArrayList<>();

    public LegoSet(String setNummer, String name) {
        this.setNummer = setNummer;
        this.name = name;
    }

    public String getSetNummer() {
        return setNummer;
    }

    public void addPiece(LegoPieces piece) {
        this.pieces.add(piece);
    }

    public List<LegoPieces> getPieces() {
        return new  ArrayList<>(pieces);
    }
}
