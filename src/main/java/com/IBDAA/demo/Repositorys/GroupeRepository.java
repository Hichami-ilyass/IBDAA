package com.IBDAA.demo.Repositorys;


import com.IBDAA.demo.Models.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe,Long> {

}