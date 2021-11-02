/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto.retos.repository;

import com.usa.reto.retos.model.Cinema;
import com.usa.reto.retos.repository.crud.CinemaCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HOLMAN RUIZ
 */

@Repository
public class CinemaRepository {
    
    @Autowired
    private CinemaCrudRepository cinemaCrudRepository;

    public List<Cinema> getAll(){
        return (List<Cinema>)cinemaCrudRepository.findAll();
    }
    public Optional<Cinema> getCinema(int id){
        return cinemaCrudRepository.findAllById(id);
    }
    
    public Cinema save(Cinema c){
        return cinemaCrudRepository.save(c);
    }
    
}
