package com.example.umich_nfl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepo teamRepo;

    @Autowired
    public TeamService(TeamRepo teamRepo){
        this.teamRepo = teamRepo;
    }

    public List<Team> getTeams(){
        return teamRepo.findAll();
    }

    public List<Team> getTeamsByName(String name){
        return teamRepo.findTeamByName(name);
    }

    public List<Team> getTeamsById(Integer id){
        return teamRepo.findTeamById(id);
    }
}
