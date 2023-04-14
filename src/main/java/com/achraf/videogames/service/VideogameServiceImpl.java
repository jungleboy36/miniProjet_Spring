package com.achraf.videogames.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.achraf.videogames.entities.Videogame;
import com.achraf.videogames.repo.VideogameRepository;
@Service
public class VideogameServiceImpl implements VideogameService {
@Autowired
VideogameRepository videogameRepository;
@Override
public Videogame saveVideogame(Videogame p) {
return videogameRepository.save(p);
}
@Override
public Videogame updateVideogame(Videogame p) {
return videogameRepository.save(p);
}
@Override
public void deleteVideogame(Videogame p) {
videogameRepository.delete(p);
}
 @Override
public void deleteVideogameById(Long id) {
videogameRepository.deleteById(id);
}
@Override
public Videogame getVideogame(Long id) {
return videogameRepository.findById(id).get();
}
@Override
public List<Videogame> getAllVideogames() {
return videogameRepository.findAll();
}
@Override
public Page<Videogame> getAllVideogamesParPage(int page, int size) {
return videogameRepository.findAll(PageRequest.of(page, size));
}

}
