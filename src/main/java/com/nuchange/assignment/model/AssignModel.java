package com.nuchange.assignment.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "Assignment")
public class AssignModel extends Base {

    private String url;

    @Column(columnDefinition = "integer default 0")
    private int count;
}
