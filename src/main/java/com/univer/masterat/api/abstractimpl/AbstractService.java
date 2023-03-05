package com.univer.masterat.api.abstractimpl;

import lombok.AllArgsConstructor;

import java.lang.module.ResolutionException;
import java.util.List;



@AllArgsConstructor
public abstract class AbstractService<T, V> {

    AbstractDAO<T, V> dao;

    public T save(T entity) {
        return dao.save(entity);
    }

    public T findById(V id) {
        return dao.findById(id).orElseThrow(() -> new ResolutionException("Entity not found"));
    }

    public T update(T entity) {
        return dao.save(entity);
    }

    public void deleteById(V id) {
        dao.deleteById(id);
    }

    public List<T> findAll() {
        return dao.findAll();
    }
}
