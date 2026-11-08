package org.example.legoprojekt.controller;


import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import org.example.legoprojekt.model.PartVariant;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/pieces")
@CrossOrigin(origins = "http://localhost:3000")

public class LegoPiecesController {

    private final Firestore db;
    public LegoPiecesController(Firestore db) {
        this.db = db;
    }

    @PostMapping
    public String addPiece(@RequestBody PartVariant partVariant)
        throws ExecutionException, InterruptedException {

        DocumentReference document = db.collection("pieces")
                .add(partVariant).get();

        return document.getId();
    }

    @GetMapping
    public String listAllPieces() throws ExecutionException, InterruptedException {
        ApiFuture<QuerySnapshot> future = db.collection("pieces").get();

        QuerySnapshot querySnapshot = future.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            System.out.println(document.getData());
        }
        return "";
    }
}
