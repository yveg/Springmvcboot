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
import org.springframework.transaction.annotation.Transactional;
import streaming.entity.Personne;
import streaming.service.PersonneServiceCRUD;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class PersonneServiceCrudTest {

    @Autowired
    private PersonneServiceCRUD serv;
    
    @Before
    public void beforeTest(){
        serv.deleteAll();
        
        Personne p = new Personne();
        p.setNom("VDP");
        p.setPrenom("jerome");
        
        Personne p1 = new Personne();
        p1.setNom("DIGNA");
        p1.setPrenom("Thomas");
        
        serv.save(p);
        serv.save(p1);
    }
    
    @Test
    public void findOneByPrenomAndNomTest(){
        
        serv.findOneByPrenomAndNom("jerome", "VDP");
     
    }
    
    
}

