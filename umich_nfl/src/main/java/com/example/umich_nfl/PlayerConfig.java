package com.example.umich_nfl;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {

    @Bean
    CommandLineRunner CommandLineRunner(PlayerRepo playerRepo){
        return args -> {
            Player ojabo = new Player(
                "David Ojabo",
                "Baltimore Ravens",
                "OLB"
            );

            Player ross = new Player(
                "Josh Ross",
                "Baltimore Ravens",
                "ILB"
            );

            Player barrett = new Player(
                "Michael Barrett",
                "Carolina Panthers",
                "ILB"
            );

            Player evans = new Player(
                "Chris Evans",
                "Cincinnati Bengals",
                "RB"
            );

            Player hill = new Player(
                "Daxton Hill",
                "Cincinnati Bengals",
                "S"
            );

            Player jenkins = new Player(
                "Kris Jenkins",
                "Cincinnati Bengals",
                "DT"
            );

            Player robbins = new Player(
                "Brad Robbins",
                "Cincinnati Bengals",
                "PT"
            );

            Player turnerii = new Player(
                "DJ Turner II",
                "Cincinnati Bengals",
                "CB"
            );

            Player bush = new Player(
                "Devin Bush",
                "Cleveland Browns",
                "LB"
            );

            Player gray = new Player(
                "Vincent Gray",
                "Cleveland Browns",
                "CB"
            );

            Player hurst = new Player(
                "Maurice Hurst II",
                "Cleveland Browns",
                "DT"
            );

            Player zinter = new Player(
                "Zak Zinter",
                "Cleveland Browns",
                "OG"
            );

            Player lewis = new Player(
                "Jourdan Lewis",
                "Dallas Cowboys",
                "CB"
            );

            Player schoony = new Player(
                "Luke Schoonmaker",
                "Dallas Cowboys",
                "TE"
            );

            Player mazi = new Player(
                "Mazi Smith",
                "Dallas Cowboys",
                "DT"
            );

            Player glasgow = new Player(
                "Graham Glasgow",
                "Detroit Lions",
                "OG"
            );

            Player hutch = new Player(
                "Aidan Hutchinson",
                "Detroit Lions",
                "DE"
            );

            Player mckeon = new Player(
                "Sean McKeon",
                "Detroit Lions",
                "TE"
            );

            Player dpj = new Player(
                "Donovan Peoples-Jones",
                "Detroit Lions",
                "WR"
            );

            Player turner = new Player(
                "James Turner",
                "Detroit Lions",
                "PK"
            );

            Player gary = new Player(
                "Rashan Gary",
                "Green Bay Packers",
                "DE"
            );

            Player green = new Player(
                "Germon Green",
                "Green Bay Packers",
                "CB"
            );

            Player collins = new Player(
                "Nico Collins",
                "Houston Texans",
                "WR"
            );

            Player henderson = new Player(
                "LaDarius Henderson",
                "Houston Texans",
                "OG"
            );

            Player mcgrone = new Player(
                "Cameron McGrone",
                "Indianapolis Colts",
                "LB"
            );

            Player paye = new Player(
                "Kwity Paye",
                "Indianapolis Colts",
                "DE"
            );

            Player danna = new Player(
                "Michael Danna",
                "Kansas City Chiefs",
                "DE"
            );

            Player barnhart = new Player(
                "Karsen Barnhart",
                "Los Angeles Chargers",
                "OG"
            );

            Player colson = new Player(
                "Junior Colson",
                "Los Angeles Chargers",
                "ILB"
            );

            Player hinton = new Player(
                "Christopher Hinton",
                "Los Angeles Chargers",
                "DT"
            );

            Player cojo = new Player(
                "Cornelius Johnson",
                "Los Angeles Chargers",
                "WR"
            );

            Player mason = new Player(
                "Ben Mason",
                "Los Angeles Chargers",
                "FB"
            );

            Player corum = new Player(
                "Blake Corum",
                "Los Angeles Rams",
                "RB"
            );

            Player wallace = new Player(
                "Josh Wallace",
                "Los Angeles Rams",
                "CB"
            );

            Player gentry = new Player(
                "Zach Gentry",
                "Las Vegas Raiders",
                "TE"
            );

            Player hayes = new Player(
                "Ryan Hayes",
                "Miami Dolphins",
                "OT"
            );

            Player jj = new Player(
                "JJ McCarthy",
                "Minnesota Vikings",
                "QB"
            );

            Player metellus = new Player(
                "Josh Metellus",
                "Minnesota Vikings",
                "S"
            );

            Player owenu = new Player(
                "Michael Owenu",
                "New England Patriots",
                "OT"
            );

            Player jabrill = new Player(
                "Jabrill Peppers",
                "New England Patriots",
                "S"
            );

            Player stueber = new Player(
                "Andrew Stueber",
                "New England Patriots",
                "OT"
            );

            Player uche = new Player(
                "Josh Uche",
                "New England Patriots",
                "DE"
            );

            Player hudson = new Player(
                "Khaleke Hudson",
                "New Orleans Saints",
                "LB"
            );

            Player ruiz = new Player(
                "Ceaser Ruiz",
                "New Orleans Saints",
                "OC"
            );

            Player longjr = new Player(
                "David Long Jr.",
                "New York Giants",
                "CB"
            );

            Player mayfield = new Player(
                "Jalen Mayfield",
                "New York Giants",
                "OG"
            );

            Player runyan = new Player(
                "Jon Runyan",
                "New York Giants",
                "OG"
            );

            Player mcgregor = new Player(
                "Braiden McGregor",
                "New York Jets",
                "DE"
            );

            Player graham = new Player(
                "Brandon Graham",
                "Philadelphia Eagles",
                "OLB"
            );

            Player keegan = new Player(
                "Trevor Keegan",
                "Philadelphia Eagles",
                "OG"
            );

            Player wilson = new Player(
                "Roman Wilson",
                "Pittsburgh Steelers",
                "WR"
            );

            Player barner = new Player(
                "AJ Barner",
                "Seattle Seahawks",
                "TE"
            );

            Player morris = new Player(
                "Mike Morris",
                "Seattle Seahawks",
                "DE"
            );

            Player olu = new Player(
                "Olu Oluwatimi",
                "Seattle Seahawks",
                "OC"
            );

            Player bell = new Player(
                "Ronnie Bell",
                "San Francisco 49ers",
                "WR"
            );

            Player moody = new Player(
                "Jake Moody",
                "San Francisco 49ers",
                "PK"
            );

            Player nugent = new Player(
                "Drake Nugent",
                "San Francisco 49ers",
                "OC"
            );

            Player thomas = new Player(
                "Ambry Thomas",
                "San Francisco 49ers",
                "CB"
            );

            Player bredeson = new Player(
                "Ben Bredeson",
                "Tampa Bay Buccaneers",
                "OG"
            );

            Player harrell = new Player(
                "Jaylen Harrell",
                "Tennessee Titans",
                "DE"
            );

            Player haskins = new Player(
                "Hassan Haskins",
                "Tennessee Titans",
                "RB"
            );

            Player frozone = new Player(
                "Mike Sainristil",
                "Washington Commanders",
                "CB"
            );

            playerRepo.saveAll(List.of(ojabo, ross, barrett, evans, hill, jenkins, robbins, turnerii, bush, gray, hurst, zinter, lewis, schoony, mazi, glasgow, hutch, mckeon, dpj, turner, gary, green, collins, henderson, mcgrone, danna, paye, barnhart, colson, hinton, cojo, mason, corum, wallace, gentry, hayes, jj, metellus, owenu, jabrill, stueber, uche, hudson, ruiz, longjr, mayfield, runyan, mcgregor, graham, keegan, wilson, barner, morris, olu, bell, moody, nugent, thomas, bredeson, harrell, haskins, frozone));

        };

    }
}
