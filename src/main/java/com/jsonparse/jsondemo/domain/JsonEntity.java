package com.jsonparse.jsondemo.domain;

import org.springframework.data.annotation.AccessType;

import javax.persistence.*;

@Entity
@Table(name = "jsondata")
@AccessType(AccessType.Type.FIELD)
public class JsonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer Id;
    private String name;
    private String address;

    public JsonEntity() {
    }

    public JsonEntity(Integer id, String name, String address) {
        Id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "JsonEntity{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
