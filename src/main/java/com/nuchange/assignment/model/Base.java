package com.nuchange.assignment.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import static java.util.UUID.randomUUID;

@MappedSuperclass
@Data
public abstract class Base implements Serializable {

    @Id
    @Column(unique = true, updatable = false, nullable = false, length = 100)
    private String uuid;

    public Base() {
        this.uuid = randomUUID().toString();
    }
}
