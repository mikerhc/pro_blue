package com.example.umich_nfl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepo extends JpaRepository<Team, Long>{

    // find players by name
    List<Team> findTeamByName(String name);
    //find players by team
    List<Team> findTeamById(Integer id);


}
