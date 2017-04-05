package com.itswwl.practice.dao;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseDao<T, PK extends Serializable> extends CrudRepository<T, PK>, PagingAndSortingRepository<T, PK>, JpaSpecificationExecutor<T> {

}
