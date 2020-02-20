package com.example.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by emujica on 27/01/2020.
 */
@RestController
public class EjeContro {

    @Autowired
    Repository repository ;

    @GetMapping("/get/items")
    public List<Item> getAll() {
        return repository.findAll();
    }
    @GetMapping("/get/items/{id}")
    public ResponseEntity<Optional<Item>> getId(@PathVariable("id") String id) {
        Optional<Item> item=repository.findById(id);

        return ResponseEntity.ok().body(item);
    }
    @PostMapping("/update/items")
    public ResponseEntity<Item> save(@RequestBody Item item) {
        repository.save(item);

        return ResponseEntity.ok().body(item);
    }
}
