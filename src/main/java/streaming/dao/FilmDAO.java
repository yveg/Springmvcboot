package streaming.dao;


import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Film;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
// crudRepository<entity, Type de la clef primaire>
public interface FilmDAO extends CrudRepository<Film, Long> {
    
}
