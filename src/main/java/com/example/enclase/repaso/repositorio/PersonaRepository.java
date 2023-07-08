/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.enclase.repaso.repositorio;


import com.example.enclase.repaso.modelo.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author ortiz
 */
public interface PersonaRepository extends MongoRepository<Persona, Long>{
    
}
