/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlProducer;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.xml.sax.InputSource;
import streaming.entity.Personne;
import streaming.service.FilmServiceCRUD;
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
    private FilmServiceCRUD serv;
    
    @Before
    public void beforeTest() throws ClassNotFoundException, SQLException, DatabaseUnitException, FileNotFoundException{
     /*   serv.deleteAll();
        
        Personne p = new Personne();
        p.setNom("VDP");
        p.setPrenom("jerome");
        
        Personne p1 = new Personne();
        p1.setNom("DIGNA");
        p1.setPrenom("Thomas");
        
        serv.save(p);
        serv.save(p1);
        */
      // Connexion DB
        Class driverClass = Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection jdbcConnection = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/sample", "app", "app");
        IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);
        
        // Import
        FlatXmlDataSet dataSet = new FlatXmlDataSet(new FlatXmlProducer(new InputSource(new FileInputStream("donnees.xml"))));
        DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet); }
    
    @Test
    public void findOneByPrenomAndNomTest(){
        //serv.findOneByPrenomAndNom("jerome", "VDP");
     
    }
    
    
}

