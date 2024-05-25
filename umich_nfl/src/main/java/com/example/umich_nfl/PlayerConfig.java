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
                "OLB",
                "https://www.baltimoreravens.com/team/players-roster/david-ojabo/"
            );

            Player ross = new Player(
                "Josh Ross",
                "Baltimore Ravens",
                "ILB",
                "https://www.baltimoreravens.com/team/players-roster/josh-ross/"
            );

            Player barrett = new Player(
                "Michael Barrett",
                "Carolina Panthers",
                "ILB",
                "https://www.panthers.com/team/players-roster/michael-barrett/"
            );

            Player evans = new Player(
                "Chris Evans",
                "Cincinnati Bengals",
                "RB",
                "https://www.bengals.com/team/players-roster/chris-evans/"
            );

            Player hill = new Player(
                "Daxton Hill",
                "Cincinnati Bengals",
                "S",
                "https://www.bengals.com/team/players-roster/dax-hill/"
            );

            Player jenkins = new Player(
                "Kris Jenkins",
                "Cincinnati Bengals",
                "DT",
                "https://www.bengals.com/team/players-roster/kris-jenkins/"
            );

            Player robbins = new Player(
                "Brad Robbins",
                "Cincinnati Bengals",
                "PT",
                "https://www.bengals.com/team/players-roster/brad-robbins/"
            );

            Player turnerii = new Player(
                "DJ Turner II",
                "Cincinnati Bengals",
                "CB",
                "https://www.bengals.com/team/players-roster/dj-turner-ii/"
            );

            Player bush = new Player(
                "Devin Bush",
                "Cleveland Browns",
                "LB",
                "https://www.clevelandbrowns.com/team/players-roster/devin-bush/"
            );

            Player gray = new Player(
                "Vincent Gray",
                "Cleveland Browns",
                "CB",
                "https://www.clevelandbrowns.com/team/players-roster/vincent-gray/"
            );

            Player hurst = new Player(
                "Maurice Hurst II",
                "Cleveland Browns",
                "DT",
                "https://www.clevelandbrowns.com/team/players-roster/maurice-hurst/"
            );

            Player zinter = new Player(
                "Zak Zinter",
                "Cleveland Browns",
                "OG",
                "https://www.clevelandbrowns.com/team/players-roster/zak-zinter/"
            );

            Player lewis = new Player(
                "Jourdan Lewis",
                "Dallas Cowboys",
                "CB",
                "https://www.dallascowboys.com/team/players-roster/jourdan-lewis/"
            );

            Player schoony = new Player(
                "Luke Schoonmaker",
                "Dallas Cowboys",
                "TE",
                "https://www.dallascowboys.com/team/players-roster/luke-schoonmaker/"
            );

            Player mazi = new Player(
                "Mazi Smith",
                "Dallas Cowboys",
                "DT",
                "https://www.dallascowboys.com/team/players-roster/mazi-smith/"
            );

            Player glasgow = new Player(
                "Graham Glasgow",
                "Detroit Lions",
                "OG",
                "https://www.detroitlions.com/team/players-roster/graham-glasgow/"
            );

            Player hutch = new Player(
                "Aidan Hutchinson",
                "Detroit Lions",
                "DE",
                "https://www.detroitlions.com/team/players-roster/aidan-hutchinson/"
            );

            Player mckeon = new Player(
                "Sean McKeon",
                "Detroit Lions",
                "TE",
                "https://www.detroitlions.com/team/players-roster/sean-mckeon/"
            );

            Player dpj = new Player(
                "Donovan Peoples-Jones",
                "Detroit Lions",
                "WR",
                "https://www.detroitlions.com/team/players-roster/donovan-peoples-jones/"
            );

            Player turner = new Player(
                "James Turner",
                "Detroit Lions",
                "PK",
                "https://www.detroitlions.com/team/players-roster/james-turner/"
            );

            Player gary = new Player(
                "Rashan Gary",
                "Green Bay Packers",
                "DE",
                "https://www.packers.com/team/players-roster/rashan-gary/"
            );

            Player green = new Player(
                "Germon Green",
                "Green Bay Packers",
                "CB",
                "https://www.packers.com/team/players-roster/gemon-green/"
            );

            Player collins = new Player(
                "Nico Collins",
                "Houston Texans",
                "WR",
                "https://www.houstontexans.com/team/players-roster/nico-collins/"
            );

            Player henderson = new Player(
                "LaDarius Henderson",
                "Houston Texans",
                "OG",
                "https://www.houstontexans.com/team/players-roster/ladarius-henderson/"
            );

            Player mcgrone = new Player(
                "Cameron McGrone",
                "Indianapolis Colts",
                "LB",
                "https://www.colts.com/team/players-roster/cameron-mcgrone/"
            );

            Player paye = new Player(
                "Kwity Paye",
                "Indianapolis Colts",
                "DE",
                "https://www.colts.com/team/players-roster/kwity-paye/"
            );

            Player danna = new Player(
                "Michael Danna",
                "Kansas City Chiefs",
                "DE",
                "https://www.chiefs.com/team/players-roster/michael-danna/"
            );

            Player barnhart = new Player(
                "Karsen Barnhart",
                "Los Angeles Chargers",
                "OG",
                "https://www.chargers.com/team/players-roster/karsen-barnhart/"
            );

            Player colson = new Player(
                "Junior Colson",
                "Los Angeles Chargers",
                "ILB",
                "https://www.chargers.com/team/players-roster/junior-colson/"
            );

            Player hinton = new Player(
                "Christopher Hinton",
                "Los Angeles Chargers",
                "DT",
                "https://www.chargers.com/team/players-roster/christopher-hinton/"
            );

            Player cojo = new Player(
                "Cornelius Johnson",
                "Los Angeles Chargers",
                "WR",
                "https://www.chargers.com/team/players-roster/cornelius-johnson/"
            );

            Player mason = new Player(
                "Ben Mason",
                "Los Angeles Chargers",
                "FB",
                "https://www.chargers.com/team/players-roster/ben-mason/"
            );

            Player corum = new Player(
                "Blake Corum",
                "Los Angeles Rams",
                "RB",
                "https://www.therams.com/team/players-roster/blake-corum/"
            );

            Player wallace = new Player(
                "Josh Wallace",
                "Los Angeles Rams",
                "CB",
                "https://www.therams.com/team/players-roster/josh-wallace/"
            );

            Player gentry = new Player(
                "Zach Gentry",
                "Las Vegas Raiders",
                "TE",
                "https://www.raiders.com/team/players-roster/zach-gentry/"
            );

            Player hayes = new Player(
                "Ryan Hayes",
                "Miami Dolphins",
                "OT",
                "https://www.miamidolphins.com/team/players-roster/ryan-hayes/"
            );

            Player jj = new Player(
                "JJ McCarthy",
                "Minnesota Vikings",
                "QB",
                "https://www.vikings.com/team/players-roster/j-j-mccarthy/"
            );

            Player metellus = new Player(
                "Josh Metellus",
                "Minnesota Vikings",
                "S",
                "https://www.vikings.com/team/players-roster/josh-metellus/"
            );

            Player owenu = new Player(
                "Michael Owenu",
                "New England Patriots",
                "OT",
                "https://www.patriots.com/team/players-roster/mike-onwenu/"
            );

            Player jabrill = new Player(
                "Jabrill Peppers",
                "New England Patriots",
                "S",
                "https://www.patriots.com/team/players-roster/jabrill-peppers/"
            );

            Player stueber = new Player(
                "Andrew Stueber",
                "New England Patriots",
                "OT",
                "https://www.patriots.com/team/players-roster/andrew-stueber/"
            );

            Player uche = new Player(
                "Josh Uche",
                "New England Patriots",
                "DE",
                "https://www.patriots.com/team/players-roster/josh-uche/"
            );

            Player hudson = new Player(
                "Khaleke Hudson",
                "New Orleans Saints",
                "LB",
                "https://www.neworleanssaints.com/team/players-roster/khaleke-hudson/"
            );

            Player ruiz = new Player(
                "Cesar Ruiz",
                "New Orleans Saints",
                "OC",
                "https://www.neworleanssaints.com/team/players-roster/cesar-ruiz/"
            );

            Player longjr = new Player(
                "David Long Jr.",
                "New York Giants",
                "CB",
                "https://www.giants.com/team/players-roster/david-long/"
            );

            Player mayfield = new Player(
                "Jalen Mayfield",
                "New York Giants",
                "OG",
                "https://www.giants.com/team/players-roster/jalen-mayfield/"
            );

            Player runyan = new Player(
                "Jon Runyan",
                "New York Giants",
                "OG",
                "https://www.giants.com/team/players-roster/jon-runyan/"
            );

            Player mcgregor = new Player(
                "Braiden McGregor",
                "New York Jets",
                "DE",
                "https://www.newyorkjets.com/team/players-roster/braiden-mcgregor/"
            );

            Player graham = new Player(
                "Brandon Graham",
                "Philadelphia Eagles",
                "OLB",
                "https://www.philadelphiaeagles.com/team/players-roster/brandon-graham/"
            );

            Player keegan = new Player(
                "Trevor Keegan",
                "Philadelphia Eagles",
                "OG",
                "https://www.philadelphiaeagles.com/team/players-roster/trevor-keegan/"
            );

            Player wilson = new Player(
                "Roman Wilson",
                "Pittsburgh Steelers",
                "WR",
                "https://www.steelers.com/team/players-roster/roman-wilson/"
            );

            Player barner = new Player(
                "AJ Barner",
                "Seattle Seahawks",
                "TE",
                "https://www.seahawks.com/team/players-roster/aj-barner/"
            );

            Player morris = new Player(
                "Mike Morris",
                "Seattle Seahawks",
                "DE",
                "https://www.seahawks.com/team/players-roster/mike-morris/"
            );

            Player olu = new Player(
                "Olu Oluwatimi",
                "Seattle Seahawks",
                "OC",
                "https://www.seahawks.com/team/players-roster/olu-oluwatimi/"
            );

            Player bell = new Player(
                "Ronnie Bell",
                "San Francisco 49ers",
                "WR",
                "https://www.49ers.com/team/players-roster/ronnie-bell/"
            );

            Player moody = new Player(
                "Jake Moody",
                "San Francisco 49ers",
                "PK",
                "https://www.49ers.com/team/players-roster/jake-moody/"
            );

            Player nugent = new Player(
                "Drake Nugent",
                "San Francisco 49ers",
                "OC",
                "https://www.49ers.com/team/players-roster/drake-nugent/"
            );

            Player thomas = new Player(
                "Ambry Thomas",
                "San Francisco 49ers",
                "CB",
                "https://www.49ers.com/team/players-roster/ambry-thomas/"
            );

            Player bredeson = new Player(
                "Ben Bredeson",
                "Tampa Bay Buccaneers",
                "OG",
                "https://www.buccaneers.com/team/players-roster/ben-bredeson/"
            );

            Player harrell = new Player(
                "Jaylen Harrell",
                "Tennessee Titans",
                "DE",
                "https://www.tennesseetitans.com/team/players-roster/jaylen-harrell/"
            );

            Player haskins = new Player(
                "Hassan Haskins",
                "Tennessee Titans",
                "RB",
                "https://www.tennesseetitans.com/team/players-roster/hassan-haskins/"
            );

            Player frozone = new Player(
                "Mike Sainristil",
                "Washington Commanders",
                "CB",
                "https://www.commanders.com/team/players-roster/mike-sainristil/"
            );

            playerRepo.saveAll(List.of(ojabo, ross, barrett, evans, hill, jenkins, robbins, turnerii, bush, gray, hurst, zinter, lewis, schoony, mazi, glasgow, hutch, mckeon, dpj, turner, gary, green, collins, henderson, mcgrone, danna, paye, barnhart, colson, hinton, cojo, mason, corum, wallace, gentry, hayes, jj, metellus, owenu, jabrill, stueber, uche, hudson, ruiz, longjr, mayfield, runyan, mcgregor, graham, keegan, wilson, barner, morris, olu, bell, moody, nugent, thomas, bredeson, harrell, haskins, frozone));

        };

    }
}
