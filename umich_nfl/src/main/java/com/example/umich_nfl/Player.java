package com.example.umich_nfl;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Player {


    @Id
    @SequenceGenerator(
        name = "player_sequence",
        sequenceName = "player_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy =  GenerationType.SEQUENCE,
        generator = "player_sequence"
    )
    private Long id;
    private String name;
    private String team;
    private String position;
    private String rosterUrl;
    
    public Player(){

    }

    public Player(Long id, String name, String team, String position, String rosterUrl){
        this.id = id;
        this.name = name;
        this.team = team;
        this.position = position;
        this.rosterUrl = rosterUrl;
    }

    public Player(String name, String team, String position, String rosterUrl){
        this.name = name;
        this.team = team;
        this.position = position;
        this.rosterUrl = rosterUrl;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getTeam(){
        return this.team;
    }

    public void setTeam(String team){
        this.team = team;
    }

    public String getPosition(){
        return this.position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getRosterUrl(){
        return this.rosterUrl;
    }
    
    public void setRosterUrl(String rosterUrl){
        this.rosterUrl = rosterUrl;
    }

    @Override
    public String toString(){
        return "Player{" + "id=" + id + ", name ='" + name + '\'' + ", team =" + team + '\'' + ", position=" + position + '\'' + ", rosterUrl =" + rosterUrl + '}';
    }

}
