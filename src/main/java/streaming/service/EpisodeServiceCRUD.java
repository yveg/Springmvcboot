/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Episode;

/**
 *
 * @author admin
 */
public interface EpisodeServiceCRUD extends CrudRepository<Episode, Long>{
    //15. Tous les épisodes d'une saison donnée d'une série donnée, classés par ordre
    public List<Episode> findAllBySaisonSerieIdAndSaisonNumSaison(long serieid, Integer numsaison);
    
}
