package org.example.legoprojekt.controller;


import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import org.example.legoprojekt.model.LegoPieces;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController("/pieces")
public class LegoPiecesController {

    private final Firestore db;
    public LegoPiecesController(Firestore db) {
        this.db = db;
    }

    @PostMapping("/pieces")
    @CrossOrigin("http://localhost:3000/")
    public List<LegoPieces> setLegoPieces(@RequestBody LegoPieces legoPieces) {
        ApiFuture<WriteResult> future = db.collection("pieces").document(legoPieces.getType().getName())
                .set(legoPieces);
        return Collections.singletonList(legoPieces);
    }

    @GetMapping("/pieces")
    public List<Object> getInformation() throws ExecutionException, InterruptedException {
        ApiFuture<QuerySnapshot> query = db.collection("pieces").get();
        List<Object> pieces = new ArrayList<>();

        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            pieces.add(document.toObject(LegoPieces.class));
        }
        System.out.print(pieces.size());
        return pieces;

    }
}
