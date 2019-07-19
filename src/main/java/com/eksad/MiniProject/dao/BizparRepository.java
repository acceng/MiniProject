package com.eksad.MiniProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eksad.MiniProject.model.Bizpar;

@Repository
public interface BizparRepository extends JpaRepository<Bizpar, Long>{

}
