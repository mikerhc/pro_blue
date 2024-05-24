package com.example.umich_nfl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepo playerRepo;

    @Autowired
    public PlayerService(PlayerRepo playerRepo){
        this.playerRepo = playerRepo;
    }

    public List<Player> getPlayers(){
        return playerRepo.findAll();
    }

    public List<Player> getPlayersByName(String name){
        return playerRepo.findPlayerByName(name);
    }

    public List<Player> getPlayersByTeam(String team){
        return playerRepo.findPlayerByTeam(team);
    }

}
