package com.achraf.videogames.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achraf.videogames.entities.Videogame;

public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}
