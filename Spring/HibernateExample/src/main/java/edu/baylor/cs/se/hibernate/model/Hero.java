package edu.baylor.cs.se.hibernate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@NamedQueries({
        @NamedQuery(
                name = "Hero.findName",
                query = "SELECT h FROM Hero h Where h.name = :name"
        )
})
@Entity
public class Hero {
    @Id
    @GeneratedValue
    @Column(name = "heroId", nullable = false)
    private Long heroId;


    @Column(unique = true, name = "name")
    private String name;

    @Column(unique = true, name = "race")
    private String race;

    @Column(name="strength")
    private float strength;

    private State state;

    public enum State
    {
        good, bad;
    }

    public Hero()
    {

    }

    public String getName()
    {
        return name;
    }
     public void setName(String name)
     {
         this.name = name;
     }

     public String getRace()
     {
         return race;
     }
     public void setRace(String race)
     {
         this.race = race;
     }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

}
