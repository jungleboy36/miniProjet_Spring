package com.achraf.videogames.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.achraf.videogames.entities.Videogame;
public interface VideogameService {
Videogame saveVideogame(Videogame p);
Videogame updateVideogame(Videogame p);
void deleteVideogame(Videogame p);
 void deleteVideogameById(Long id);
Videogame getVideogame(Long id);
List<Videogame> getAllVideogames();
Page<Videogame> getAllVideogamesParPage(int page, int size);
}