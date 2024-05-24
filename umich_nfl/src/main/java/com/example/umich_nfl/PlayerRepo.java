package com.example.umich_nfl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Long>{

    // find players by name
    List<Player> findPlayerByName(String name);
    //find players by team
    List<Player> findPlayerByTeam(String team);


}
