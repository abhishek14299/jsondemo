package com.jsonparse.jsondemo.dao;

import com.jsonparse.jsondemo.domain.JsonEntity;
import org.springframework.data.repository.CrudRepository;

public interface JsonDao extends CrudRepository<JsonEntity,Long> {

}
