package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Estudianet;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudianet,Integer>{

}
