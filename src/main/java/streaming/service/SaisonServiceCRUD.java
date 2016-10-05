/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
public interface SaisonServiceCRUD extends CrudRepository<Saison, Long>{
    //14. Toutes les saisons d'une série donnée classées par ordre
    //public List<Saison> findAllbySerieTitreOrderBySerieTitreAsc(String titreserie); 
    public List<Saison> findAllbySerieIdOrderByNumSaison(long id);
    
}
