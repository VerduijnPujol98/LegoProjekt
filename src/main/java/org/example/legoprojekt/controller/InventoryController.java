package org.example.legoprojekt.controller;

import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final Firestore db;

    public InventoryController(Firestore db) {
        this.db = db;
    }

    @PostMapping
    public String addEntry(
            @RequestParam String partId,
            @RequestParam int quantity)
            throws ExecutionException, InterruptedException {

        Map<String, Object> entry = new HashMap<>();
        entry.put("partId", partId);
        entry.put("quantity", quantity);

        DocumentReference document =
                db.collection("inventory").add(entry).get();

        return document.getId();
    }

    @GetMapping
    public List<Map<String, Object>> getInventory()
    throws ExecutionException, InterruptedException {
        QuerySnapshot snapshot = db.collection("inventory").get().get();

        List<Map<String, Object>> inventory = new ArrayList<>();

        for (QueryDocumentSnapshot document : snapshot) {
            inventory.add(document.getData());
        }

        return inventory;
    }
}