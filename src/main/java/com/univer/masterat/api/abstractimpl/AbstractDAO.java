package com.univer.masterat.api.abstractimpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface AbstractDAO<T, ID> extends JpaRepository<T, ID> {
}
