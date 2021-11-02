/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto.retos.repository.crud;

import com.usa.reto.retos.model.Cinema;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author HOLMAN RUIZ
 */
public interface CinemaCrudRepository extends CrudRepository<Cinema, Integer>{

    public Optional<Cinema> findAllById(int id);
    
}
