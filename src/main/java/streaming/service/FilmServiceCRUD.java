package streaming.service;

import java.io.Serializable;
import java.util.List;
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
public interface FilmServiceCRUD extends CrudRepository<Film, Long> {

    // 1. Le film pour un titre donné
    public Film findOneByTitre(String txt);

    //2. Les films pour une année donnée
    public List<Film> findAllByAnnee(Integer an);

    // 3. Les films pour un titre donné ou un année donnée
    public List<Film> findAllByTitreOrAnnee(String txt, Integer an);

    //4. Les films pour un titre et une année donnée
    public List<Film> findAllByTitreAndAnnee(String txt, Integer an);

    // 5. Les films pour un genre id donné
    public List<Film> findAllByGenreId(Long genreid);

    //6. Les films pour un pays id donnée
    public List<Film> findAllByPaysId(Long paysid);

    //7. Les films pour un genre id et un pays id donnés
    public List<Film> findAllByPaysIdAndGenreId(Long gen, Long pay);

    //8. Les films pour un acteur (nom/prénom) donné
    public List<Film> findAllByActeurs_NomAndActeurs_Prenom(String prenom, String nom);

//9. Le nombre de films pour un acteur donné
    public Long countByActeurs_NomAndActeursPrenom(String nom, String prenom);

    //10. Les films pour un réalisateur donné, classés par titre
    public List<Film> findAllByRealisateursNomAndRealisateursPrenomOrderByTitre(String pre, String nom);

//11. Le nombre de films pour un réalisateur donné
     public Long countByRealisateursNomAndRealisateursPrenom(String pre, String nom);
     
     //12. Les films d'un pays donné, pour un genre donné, un réalisateur donné et un acteur donné
     public List<Film> findAllByPaysNomAndGenreNomAndRealisateursNomAndActeursPrenomAndActeursNom(String pay,String genr, String rean,String actp, String actn);
    
}
