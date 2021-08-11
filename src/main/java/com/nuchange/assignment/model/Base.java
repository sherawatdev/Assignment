package com.nuchange.assignment.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import static java.util.UUID.randomUUID;

@MappedSuperclass
@Data
public abstract class Base {

    @Id
    @Column(unique = true, updatable = false, nullable = false, length = 100)
    private String uuid;

    public void setUuid (String uuid) {
        this.uuid = randomUUID().toString();
    }
}
