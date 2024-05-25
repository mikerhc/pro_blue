package com.example.umich_nfl;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Team {


    @Id
    @SequenceGenerator(
        name = "team_sequence",
        sequenceName = "team_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy =  GenerationType.SEQUENCE,
        generator = "team_sequence"
    )
    private Long id;
    private String name;
    private String imageUrl;
    private String url;
    
    public Team(){

    }

    public Team(Long id, String name, String imageUrl, String url){
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.url = url;
    }

    public Team(String name, String imageUrl, String url){
        this.name = name;
        this.imageUrl = imageUrl;
        this.url = url;
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

    public String getImageUrl(){
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public String getUrl(){
        return this.url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    @Override
    public String toString(){
        return "Team{" + "id=" + id + ", name ='" + name + '\'' + ", imageUrl =" + imageUrl + '\'' + ", url=" + url + '}';
    }

}
