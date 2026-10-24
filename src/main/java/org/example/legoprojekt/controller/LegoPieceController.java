package org.example.legoprojekt.controller;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.example.legoprojekt.model.LegoPieces;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/pieces")
public class LegoPieceController {

    private final List<LegoPieces> pieces =  new ArrayList<>();
    private final Firestore db;

    public LegoPieceController(Firestore db) {
        this.db = db;
    }


    @PostMapping
    public LegoPieces addLegoPiece(@RequestBody LegoPieces legoPiece)
    throws InterruptedException, ExecutionException {
    DocumentReference docRef = db.collection("pieces").document();
    docRef.set(legoPiece);
    pieces.add(legoPiece);
    return legoPiece;
    }

    @GetMapping
    public List<LegoPieces> getLegoPieces(){
        return new ArrayList<>(pieces);
    }
}
