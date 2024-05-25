package com.example.umich_nfl;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeamConfig {

    @Bean
    CommandLineRunner teamCommandLineRunner(TeamRepo teamRepo){
        return args -> {
            Team ravens = new Team (
                "Baltimore Ravens",
                "CDN_when_i_deploy/ravens.png",
                "ravens"
            );
            Team panthers = new Team (
                "Carolina Panthers",
                "CDN_when_i_deploy/panthers.png",
                "panthers"
            );
            Team bengals = new Team (
                "Cincinnati Bengals",
                "CDN_when_i_deploy/bengals.png",
                "bengals"
            );
            Team browns = new Team (
                "Cleveland Browns",
                "CDN_when_i_deploy/browns.png",
                "browns"
            );
            Team cowboys = new Team (
                "Dallas Cowboys",
                "CDN_when_i_deploy/cowboys.png",
                "cowboys"
            );
            Team lions = new Team (
                "Detroit Lions",
                "CDN_when_i_deploy/lions.png",
                "lions"
            );
            Team packers = new Team (
                "Green Bay Packers",
                "CDN_when_i_deploy/pack.png",
                "packers"
            );
            Team texans = new Team (
                "Houston Texans",
                "CDN_when_i_deploy/texans.png",
                "texans"
            );
            Team colts = new Team (
                "Indianapolis Colts",
                "CDN_when_i_deploy/colts.png",
                "colts"
            );
            Team chiefs = new Team (
                "Kansas City Chiefs",
                "CDN_when_i_deploy/chiefs.png",
                "chiefs"
            );
            Team chargers = new Team (
                "Los Angeles Chargers",
                "CDN_when_i_deploy/chargers.png",
                "chiefs"
            );
            Team rams = new Team (
                "Los Angeles Rams",
                "CDN_when_i_deploy/rams.png",
                "rams"
            );
            Team raiders = new Team (
                "Las Vegas Raiders",
                "CDN_when_i_deploy/raiders.png",
                "raiders"
            );
            Team phins = new Team (
                "Miami Dolphins",
                "CDN_when_i_deploy/phins.png",
                "dolphins"
            );
            Team viks = new Team (
                "Minnesota Vikings",
                "CDN_when_i_deploy/viks.png",
                "vikings"
            );
            Team pats = new Team (
                "New England Patriots",
                "CDN_when_i_deploy/pats.png",
                "patriots"
            );
            Team saints = new Team (
                "New Orleans Saints",
                "CDN_when_i_deploy/saints.png",
                "saints"
            );
            Team giants = new Team (
                "New York Giants",
                "CDN_when_i_deploy/giants.png",
                "giants"
            );
            Team jets = new Team (
                "New York Jets",
                "CDN_when_i_deploy/jets.png",
                "jets"
            );
            Team eagles = new Team (
                "Philadelphia Eagles",
                "CDN_when_i_deploy/eagles.png",
                "eagles"
            );
            Team steelers = new Team (
                "Pittsburgh Steelers",
                "CDN_when_i_deploy/steelers.png",
                "steelers"
            );
            Team seahawks = new Team (
                "Seattle Seahawks",
                "CDN_when_i_deploy/seahawks.png",
                "seahawks"
            );
            Team niners = new Team (
                "San Francisco 49ers",
                "CDN_when_i_deploy/niners.png",
                "niners"
            );
            Team bucs = new Team (
                "Tampa Bay Buccaneers",
                "CDN_when_i_deploy/bucs.png",
                "buccaneers"
            );
            Team titans = new Team (
                "Tennessee Titans",
                "CDN_when_i_deploy/titans.png",
                "titans"
            );
            Team commies = new Team (
                "Washington Commanders",
                "CDN_when_i_deploy/commies.png",
                "commies"
            );

            teamRepo.saveAll(List.of(ravens, panthers, bengals, browns, cowboys, lions, packers, texans, colts, chiefs, chargers, rams, raiders, phins, viks, pats, saints, giants, jets, eagles, steelers, seahawks, niners, bucs, titans, commies));
        };
    }

}
