package com.jsonparse.jsondemo.controller;

import com.jsonparse.jsondemo.dao.JsonDao;
import com.jsonparse.jsondemo.domain.JsonEntity;
import com.jsonparse.jsondemo.service.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/data")
@RestController
public class JsonController {

    @Autowired
    private JsonService jsonService;
   @Autowired
    private JsonDao jsonDao;
    @PostMapping("/list")
    public List<JsonEntity> JsonController (@RequestBody List<JsonEntity> jsonEntity) {
        jsonDao.saveAll(jsonEntity);
        return jsonEntity;
    }
}
