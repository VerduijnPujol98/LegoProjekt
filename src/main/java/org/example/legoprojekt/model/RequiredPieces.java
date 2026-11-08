package org.example.legoprojekt.model;

import java.util.ArrayList;

public class RequiredPieces {
    private int minimumAmount;
    private PartVariant part;

    public RequiredPieces(int minimumAmount, PartVariant part) {
        if (part == null) {
            throw new IllegalArgumentException("Required pieces cannot be null");
        }

        if (minimumAmount <= 0) {
            throw new IllegalArgumentException("Minimum amount must be positive");
        }

        this.minimumAmount = minimumAmount;
        this.part = part;
    }
}
