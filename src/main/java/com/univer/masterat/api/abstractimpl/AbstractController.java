package com.univer.masterat.api.abstractimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class AbstractController<T, ID> { // we can add DTO and have 2 methods toEntity/toDTO to have full impl

    @Autowired
    protected AbstractService<T, ID> service; // to refactor injection via setter/ or as in services.

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        T savedEntity = service.save(entity);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<T> read(ID id) {
        T entity = service.findById(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<T> update(@RequestBody T entity) {
        T updatedEntity = service.update(entity);
        return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(ID id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/list")
    public ResponseEntity<List<T>> list() {
        List<T> entities = service.findAll();
        return new ResponseEntity<>(entities, HttpStatus.OK);
    }
}
