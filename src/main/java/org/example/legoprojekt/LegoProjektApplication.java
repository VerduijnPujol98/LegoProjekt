package org.example.legoprojekt;

import org.example.legoprojekt.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class LegoProjektApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegoProjektApplication.class, args);

        Color color = new Color("Red", 233);

        PartVariant part = new PartVariant("2x4", "Rectangular", color);
        PartVariant part2 = new PartVariant("3x5", "Rectangular", color);

        RequiredPieces requiredPieces = new RequiredPieces(2, part);
        RequiredPieces requiredPieces2 = new RequiredPieces(3, part2);

        ArrayList<RequiredPieces> requiredPiecesList = new ArrayList<>();
        requiredPiecesList.add(requiredPieces);
        requiredPiecesList.add(requiredPieces2);


        Model model = new Model(2, "Batman", requiredPiecesList);
    }

}
