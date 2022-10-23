package edu.baylor.cs.se.hibernate.controller;


//import edu.baylor.cs.se.hibernate.model.Hero;

//import edu.baylor.cs.se.hibernate.services.SuperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


//Ignore this as it is Spring and not Java EE (Jax-RS) controller
@RestController

//@RequestMapping("/heroes")
public class MyController {


//    private SuperRepository superRepository;
//
//    //you should generally favour constructor/setter injection over field injection
//    @Autowired
//    public MyController(SuperRepository superRepository){
//        this.superRepository = superRepository;
//    }
//
//    //very bad practise - using GET method to insert something to DB
//    @RequestMapping(value = "/heroes/populate", method = RequestMethod.POST)
//    public ResponseEntity populate(){
//        superRepository.populate();
//        return new ResponseEntity(HttpStatus.OK);
//    }
//
//    @PostMapping("/heroes")
//    public ResponseEntity createUser(@RequestBody Hero hero)
//    {
//        superRepository.newHero(hero);
//        return new ResponseEntity(HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/heroes", method = RequestMethod.GET)
//    public ResponseEntity<Hero> getPlayer(){
//        return new ResponseEntity(superRepository.getPerson(),HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/heroes/{id}", method = RequestMethod.GET)
//    public ResponseEntity<?> getHeroesById(@PathVariable Long id){
//        List<Hero> hr = superRepository.getheroById(id);
//        return new ResponseEntity<List<Hero>>(hr, HttpStatus.OK);
//    }


//    @RequestMapping(value = "/heroes/name", method = RequestMethod.GET)
//    public ResponseEntity<Player> getPlayerById(@RequestParam(value = "name", required = false) String name){
//        return new ResponseEntity(superRepository.getByName(name),HttpStatus.OK);
//    }

}
