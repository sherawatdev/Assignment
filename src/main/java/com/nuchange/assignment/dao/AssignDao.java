package com.nuchange.assignment.dao;

import com.nuchange.assignment.model.AssignModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignDao extends JpaRepository<AssignModel, String> {

}
