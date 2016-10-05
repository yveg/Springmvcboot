/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class FilmTest {
    
    @Autowired
    private FilmDAO dao;
    
    @Before
    public void avant(){
        
        dao.deleteAll();
    }
    
    @Test
    public void ajouterDeuxFilms() {
        
        dao.save(new Film());
        dao.save(new Film());
    }
    
}
