/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto.retos.service;

import com.usa.reto.retos.model.Cinema;
import com.usa.reto.retos.repository.CinemaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HOLMAN RUIZ
 */
@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public List<Cinema> getAll() {
        return cinemaRepository.getAll();

    }

    public Optional<Cinema> getCinema(int id) {
        return cinemaRepository.getCinema(id);
    }

    public Cinema save(Cinema c) {
        if (c.getId() == null) {
            return cinemaRepository.save(c);
        } else {
            Optional<Cinema> caux = cinemaRepository.getCinema(c.getId());
            if (caux.isEmpty()) {
                return cinemaRepository.save(c);
            } else {
                return c;
            }

        }
    }

}
