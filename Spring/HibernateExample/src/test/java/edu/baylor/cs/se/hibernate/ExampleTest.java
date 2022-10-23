package edu.baylor.cs.se.hibernate;


import edu.baylor.cs.se.hibernate.model.Hero;
import edu.baylor.cs.se.hibernate.repository.HeroRepository;
import edu.baylor.cs.se.hibernate.services.SuperRepository;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;





@SpringBootTest
public class ExampleTest {


    @PersistenceContext
    private EntityManager em;
   // @Autowired
    private SuperRepository superRepository;
    @Autowired
    private HeroRepository heroRepository;

    @Transactional
    public void populate()
    {

    }
    @Test
    //simple test
    @Transactional
    public void demoTest1() {
        populate();
        List<Hero> heros = (List<Hero>) heroRepository.findAll();
        for (Hero h: heros) {
            System.out.println(h.getName() + " " + h.getRace() + " " + h.getStrength());
        }
    }

}


