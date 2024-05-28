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
                "https://www.baltimoreravens.com/team/players-roster/david-ojabo/",
                "ravens",
                "./assets/ojabo.png",
                "https://www.instagram.com/davidojabo/?hl=en",
                "https://x.com/davidojabo"
            );

            Player ross = new Player(
                "Josh Ross",
                "Baltimore Ravens",
                "ILB",
                "https://www.baltimoreravens.com/team/players-roster/josh-ross/",
                "ravens",
                ".assets/ross.png",
                "https://www.instagram.com/joshuaross_12/?hl=en",
                "https://x.com/Ravens"
            );

            Player barrett = new Player(
                "Michael Barrett",
                "Carolina Panthers",
                "ILB",
                "https://www.panthers.com/team/players-roster/michael-barrett/",
                "panthers",
                "./assets/barrett",
                "https://www.instagram.com/mike.mb1/?hl=en",
                "https://x.com/mikebarrett_mb1?lang=en"
            );

            Player evans = new Player(
                "Chris Evans",
                "Cincinnati Bengals",
                "RB",
                "https://www.bengals.com/team/players-roster/chris-evans/",
                "bengals",
                "",
                "https://www.instagram.com/kidnplay_abc123/",
                "https://x.com/kidnplay_abc123?lang=en"
            );

            Player hill = new Player(
                "Daxton Hill",
                "Cincinnati Bengals",
                "S",
                "https://www.bengals.com/team/players-roster/dax-hill/",
                "bengals",
                "",
                "https://www.instagram.com/iamdaxhill/",
                "https://x.com/daxhill5?lang=en"
            );

            Player jenkins = new Player(
                "Kris Jenkins",
                "Cincinnati Bengals",
                "DT",
                "https://www.bengals.com/team/players-roster/kris-jenkins/",
                "bengals",
                "",
                "https://www.instagram.com/kjj_18/?hl=en",
                "https://x.com/krisjenkinsjr1?lang=en"
            );

            Player robbins = new Player(
                "Brad Robbins",
                "Cincinnati Bengals",
                "PT",
                "https://www.bengals.com/team/players-roster/brad-robbins/",
                "bengals",
                "",
                "https://www.instagram.com/__bradrobbins/?hl=en",
                "https://x.com/__br91?lang=en"
            );

            Player turnerii = new Player(
                "DJ Turner II",
                "Cincinnati Bengals",
                "CB",
                "https://www.bengals.com/team/players-roster/dj-turner-ii/",
                "bengals",
                "",
                "https://www.instagram.com/djturner_5/?hl=en",
                "https://x.com/djturner_5?lang=en"
            );

            Player bush = new Player(
                "Devin Bush",
                "Cleveland Browns",
                "LB",
                "https://www.clevelandbrowns.com/team/players-roster/devin-bush/",
                "browns",
                "",
                "",
                ""
            );

            Player gray = new Player(
                "Vincent Gray",
                "Cleveland Browns",
                "CB",
                "https://www.clevelandbrowns.com/team/players-roster/vincent-gray/",
                "browns",
                "",
                "https://www.instagram.com/vincegray/",
                "https://x.com/vincegray_?lang=en"
            );

            Player hurst = new Player(
                "Maurice Hurst II",
                "Cleveland Browns",
                "DT",
                "https://www.clevelandbrowns.com/team/players-roster/maurice-hurst/",
                "browns",
                "",
                "https://www.instagram.com/mohurstjr/?hl=en",
                "https://x.com/mohurstjr"
            );

            Player zinter = new Player(
                "Zak Zinter",
                "Cleveland Browns",
                "OG",
                "https://www.clevelandbrowns.com/team/players-roster/zak-zinter/",
                "browns",
                "",
                "https://www.instagram.com/zakzinter/?hl=en",
                "https://x.com/zak_zinter?lang=en"
            );

            Player lewis = new Player(
                "Jourdan Lewis",
                "Dallas Cowboys",
                "CB",
                "https://www.dallascowboys.com/team/players-roster/jourdan-lewis/",
                "cowboys",
                "",
                "https://www.instagram.com/jourdanjd_/?hl=en",
                "https://x.com/JourdanJD?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"
            );

            Player schoony = new Player(
                "Luke Schoonmaker",
                "Dallas Cowboys",
                "TE",
                "https://www.dallascowboys.com/team/players-roster/luke-schoonmaker/",
                "cowboys",
                "",
                "https://www.instagram.com/schoonboyq/?hl=en",
                "https://x.com/lukeschoonmaker?lang=en"
            );

            Player mazi = new Player(
                "Mazi Smith",
                "Dallas Cowboys",
                "DT",
                "https://www.dallascowboys.com/team/players-roster/mazi-smith/",
                "cowboys",
                "",
                "",
                "https://x.com/mazismith?lang=en"
            );

            Player glasgow = new Player(
                "Graham Glasgow",
                "Detroit Lions",
                "OG",
                "https://www.detroitlions.com/team/players-roster/graham-glasgow/",
                "lions",
                "",
                "https://www.instagram.com/gglasgow61/",
                "https://x.com/gglasgow61?lang=en"
            );

            Player hutch = new Player(
                "Aidan Hutchinson",
                "Detroit Lions",
                "DE",
                "https://www.detroitlions.com/team/players-roster/aidan-hutchinson/",
                "lions",
                "",
                "https://www.instagram.com/aidanhutch97/?hl=en",
                "https://x.com/aidanhutch97?lang=en"
            );

            Player mckeon = new Player(
                "Sean McKeon",
                "Detroit Lions",
                "TE",
                "https://www.detroitlions.com/team/players-roster/sean-mckeon/",
                "lions",
                "",
                "https://www.instagram.com/mckeon_sean/?hl=en",
                "https://x.com/mckeon_sean?lang=en"
            );

            Player dpj = new Player(
                "Donovan Peoples-Jones",
                "Detroit Lions",
                "WR",
                "https://www.detroitlions.com/team/players-roster/donovan-peoples-jones/",
                "lions",
                "",
                "https://www.instagram.com/dpeoplesjones/?hl=en",
                "https://x.com/dpeoplesjones"
            );

            Player turner = new Player(
                "James Turner",
                "Detroit Lions",
                "PK",
                "https://www.detroitlions.com/team/players-roster/james-turner/",
                "lions",
                "",
                "https://www.instagram.com/jamesturner4/",
                "https://x.com/jamesturner004?lang=en"
            );

            Player gary = new Player(
                "Rashan Gary",
                "Green Bay Packers",
                "DE",
                "https://www.packers.com/team/players-roster/rashan-gary/",
                "packers",
                "",
                "https://www.instagram.com/rashanagary/?hl=en",
                "https://x.com/RashanAGary"
            );

            Player green = new Player(
                "Germon Green",
                "Green Bay Packers",
                "CB",
                "https://www.packers.com/team/players-roster/gemon-green/",
                "packers",
                "",
                "https://www.instagram.com/1germ2x/",
                "https://x.com/greengemon"
            );

            Player collins = new Player(
                "Nico Collins",
                "Houston Texans",
                "WR",
                "https://www.houstontexans.com/team/players-roster/nico-collins/",
                "texans",
                "",
                "https://www.instagram.com/ncollins_4/?hl=en",
                "https://x.com/lbg_nico7?lang=en"
            );

            Player henderson = new Player(
                "LaDarius Henderson",
                "Houston Texans",
                "OG",
                "https://www.houstontexans.com/team/players-roster/ladarius-henderson/",
                "texans",
                "",
                "https://www.instagram.com/ladarius.77/?hl=en",
                ""
            );

            Player mcgrone = new Player(
                "Cameron McGrone",
                "Indianapolis Colts",
                "LB",
                "https://www.colts.com/team/players-roster/cameron-mcgrone/",
                "colts",
                "",
                "https://www.instagram.com/mcgrone.strong/?hl=en",
                "https://x.com/mcgrone_strong?lang=en"
            );

            Player paye = new Player(
                "Kwity Paye",
                "Indianapolis Colts",
                "DE",
                "https://www.colts.com/team/players-roster/kwity-paye/",
                "colts",
                "",
                "https://www.instagram.com/kwitypaye/?hl=en",
                "https://x.com/officialkwity"
            );

            Player danna = new Player(
                "Michael Danna",
                "Kansas City Chiefs",
                "DE",
                "https://www.chiefs.com/team/players-roster/michael-danna/",
                "chiefs",
                "",
                "https://www.instagram.com/mikedanna4/?hl=en",
                "https://x.com/m_danna4?lang=en"
            );

            Player barnhart = new Player(
                "Karsen Barnhart",
                "Los Angeles Chargers",
                "OG",
                "https://www.chargers.com/team/players-roster/karsen-barnhart/",
                "chargers",
                "",
                "https://www.instagram.com/k_ballin__/?hl=en",
                "https://x.com/k_ballin__?lang=en"
            );

            Player colson = new Player(
                "Junior Colson",
                "Los Angeles Chargers",
                "ILB",
                "https://www.chargers.com/team/players-roster/junior-colson/",
                "chargers",
                "",
                "https://www.instagram.com/junior_colson/?hl=en",
                "https://x.com/juniorcolson?lang=en"
            );

            Player hinton = new Player(
                "Christopher Hinton",
                "Los Angeles Chargers",
                "DT",
                "https://www.chargers.com/team/players-roster/christopher-hinton/",
                "chargers",
                "",
                "",
                ""
            );

            Player cojo = new Player(
                "Cornelius Johnson",
                "Los Angeles Chargers",
                "WR",
                "https://www.chargers.com/team/players-roster/cornelius-johnson/",
                "chargers",
                "",
                "https://www.instagram.com/corneliusnation/?hl=en",
                "https://x.com/corneliusnation?lang=en"
            );

            Player mason = new Player(
                "Ben Mason",
                "Los Angeles Chargers",
                "FB",
                "https://www.chargers.com/team/players-roster/ben-mason/",
                "chargers",
                "",
                "https://www.instagram.com/benchmason42/",
                "https://x.com/benchmason42?lang=en"
            );

            Player corum = new Player(
                "Blake Corum",
                "Los Angeles Rams",
                "RB",
                "https://www.therams.com/team/players-roster/blake-corum/",
                "rams",
                "",
                "https://www.instagram.com/blake_corum24/?hl=en",
                "https://x.com/blake_corum"
            );

            Player wallace = new Player(
                "Josh Wallace",
                "Los Angeles Rams",
                "CB",
                "https://www.therams.com/team/players-roster/josh-wallace/",
                "rams",
                "",
                "https://www.instagram.com/joshwallace/",
                "https://x.com/joshwallace_12?lang=en"
            );

            Player gentry = new Player(
                "Zach Gentry",
                "Las Vegas Raiders",
                "TE",
                "https://www.raiders.com/team/players-roster/zach-gentry/",
                "raiders",
                "",
                "https://www.instagram.com/zgentry83/",
                ""
            );

            Player hayes = new Player(
                "Ryan Hayes",
                "Miami Dolphins",
                "OT",
                "https://www.miamidolphins.com/team/players-roster/ryan-hayes/",
                "dolphins",
                "",
                "https://www.instagram.com/ryanhayes.76/?hl=en",
                "https://x.com/ryanhayes_7122?lang=en"
            );

            Player jj = new Player(
                "JJ McCarthy",
                "Minnesota Vikings",
                "QB",
                "https://www.vikings.com/team/players-roster/j-j-mccarthy/",
                "vikings",
                "",
                "https://www.instagram.com/jjmccarthy/?hl=en",
                "https://x.com/jjmccarthy09?lang=en"
            );

            Player metellus = new Player(
                "Josh Metellus",
                "Minnesota Vikings",
                "S",
                "https://www.vikings.com/team/players-roster/josh-metellus/",
                "vikings",
                "",
                "https://www.instagram.com/noexcuses_23/?hl=en",
                "https://x.com/NoExcuses_23?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"
            );

            Player owenu = new Player(
                "Michael Owenu",
                "New England Patriots",
                "OT",
                "https://www.patriots.com/team/players-roster/mike-onwenu/",
                "patriots",
                "",
                "https://www.instagram.com/michaelonwenu1/",
                "https://x.com/_mxkey?lang=en"
            );

            Player jabrill = new Player(
                "Jabrill Peppers",
                "New England Patriots",
                "S",
                "https://www.patriots.com/team/players-roster/jabrill-peppers/",
                "patriots",
                "",
                "https://www.instagram.com/teamjreall/?hl=en",
                "https://x.com/JabrillPeppers?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"
            );

            Player stueber = new Player(
                "Andrew Stueber",
                "New England Patriots",
                "OT",
                "https://www.patriots.com/team/players-roster/andrew-stueber/",
                "patriots",
                "",
                "https://www.instagram.com/andrew.stueber/",
                "https://x.com/andrewstueber99"
            );

            Player uche = new Player(
                "Josh Uche",
                "New England Patriots",
                "DE",
                "https://www.patriots.com/team/players-roster/josh-uche/",
                "patriots",
                "",
                "https://www.instagram.com/josh_uche/?hl=en",
                "https://x.com/_uche35?lang=en"
            );

            Player hudson = new Player(
                "Khaleke Hudson",
                "New Orleans Saints",
                "LB",
                "https://www.neworleanssaints.com/team/players-roster/khaleke-hudson/",
                "saints",
                "",
                "https://www.instagram.com/bigleke7/?hl=en",
                "https://x.com/KhalekeHudson?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"
            );

            Player ruiz = new Player(
                "Cesar Ruiz",
                "New Orleans Saints",
                "OC",
                "https://www.neworleanssaints.com/team/players-roster/cesar-ruiz/",
                "saints",
                "",
                "https://www.instagram.com/ceesruiz/",
                "https://x.com/_overcees?lang=en"
            );

            Player longjr = new Player(
                "David Long Jr.",
                "New York Giants",
                "CB",
                "https://www.giants.com/team/players-roster/david-long/",
                "giants",
                "",
                "",
                ""
            );

            Player mayfield = new Player(
                "Jalen Mayfield",
                "New York Giants",
                "OG",
                "https://www.giants.com/team/players-roster/jalen-mayfield/",
                "giants",
                "",
                "https://www.instagram.com/gucci_jay_/",
                "https://x.com/jay_may_11?lang=en"
            );

            Player runyan = new Player(
                "Jon Runyan",
                "New York Giants",
                "OG",
                "https://www.giants.com/team/players-roster/jon-runyan/",
                "giants",
                "",
                "https://www.instagram.com/jon_run1/?hl=en",
                ""
            );

            Player mcgregor = new Player(
                "Braiden McGregor",
                "New York Jets",
                "DE",
                "https://www.newyorkjets.com/team/players-roster/braiden-mcgregor/",
                "jets",
                "",
                "https://www.instagram.com/braiden_mcgregor/?hl=en",
                "https://x.com/braidenmcgregor?lang=en"
            );

            Player graham = new Player(
                "Brandon Graham",
                "Philadelphia Eagles",
                "OLB",
                "https://www.philadelphiaeagles.com/team/players-roster/brandon-graham/",
                "eagles",
                "",
                "https://www.instagram.com/sack_55/?hl=en",
                ""
            );

            Player keegan = new Player(
                "Trevor Keegan",
                "Philadelphia Eagles",
                "OG",
                "https://www.philadelphiaeagles.com/team/players-roster/trevor-keegan/",
                "eagles",
                "",
                "https://www.instagram.com/trevor.keegan77/",
                "https://x.com/bigtrevk?lang=en"
            );

            Player wilson = new Player(
                "Roman Wilson",
                "Pittsburgh Steelers",
                "WR",
                "https://www.steelers.com/team/players-roster/roman-wilson/",
                "steelers",
                "",
                "https://www.instagram.com/trilllroman/?hl=en",
                "https://x.com/trilllroman?lang=en"
            );

            Player barner = new Player(
                "AJ Barner",
                "Seattle Seahawks",
                "TE",
                "https://www.seahawks.com/team/players-roster/aj-barner/",
                "seahawks",
                "",
                "https://www.instagram.com/ajbarner88/?hl=en",
                "https://x.com/_ajbarner_?lang=en"
            );

            Player morris = new Player(
                "Mike Morris",
                "Seattle Seahawks",
                "DE",
                "https://www.seahawks.com/team/players-roster/mike-morris/",
                "seahawks",
                "",
                "https://www.instagram.com/the_moneymikee/?hl=en",
                "https://x.com/mikemoris87"
            );

            Player olu = new Player(
                "Olu Oluwatimi",
                "Seattle Seahawks",
                "OC",
                "https://www.seahawks.com/team/players-roster/olu-oluwatimi/",
                "seahawks",
                "",
                "https://www.instagram.com/big_olu55/?hl=en",
                "https://x.com/bigolu55?lang=en"
            );

            Player bell = new Player(
                "Ronnie Bell",
                "San Francisco 49ers",
                "WR",
                "https://www.49ers.com/team/players-roster/ronnie-bell/",
                "niners",
                "",
                "https://www.instagram.com/ronniebell_8/?hl=en",
                "https://x.com/ronnieb_8?lang=en"
            );

            Player moody = new Player(
                "Jake Moody",
                "San Francisco 49ers",
                "PK",
                "https://www.49ers.com/team/players-roster/jake-moody/",
                "niners",
                "",
                "https://www.instagram.com/jmoods_/?hl=en",
                "https://x.com/jmoods13?lang=en"
            );

            Player nugent = new Player(
                "Drake Nugent",
                "San Francisco 49ers",
                "OC",
                "https://www.49ers.com/team/players-roster/drake-nugent/",
                "niners",
                "",
                "https://www.instagram.com/drakenugent9/?hl=en",
                "https://x.com/drakenugent9?lang=en"
            );

            Player thomas = new Player(
                "Ambry Thomas",
                "San Francisco 49ers",
                "CB",
                "https://www.49ers.com/team/players-roster/ambry-thomas/",
                "niners",
                "",
                "https://www.instagram.com/fastlife_von/?hl=en",
                ""
            );

            Player bredeson = new Player(
                "Ben Bredeson",
                "Tampa Bay Buccaneers",
                "OG",
                "https://www.buccaneers.com/team/players-roster/ben-bredeson/",
                "buccaneers",
                "",
                "https://www.instagram.com/bredesonben/?hl=en",
                "https://x.com/ben_bredeson?lang=en"
            );

            Player harrell = new Player(
                "Jaylen Harrell",
                "Tennessee Titans",
                "DE",
                "https://www.tennesseetitans.com/team/players-roster/jaylen-harrell/",
                "titans",
                "",
                "https://www.instagram.com/_jayharrell32/?hl=en",
                "https://x.com/jayharrell32?lang=en"
            );

            Player haskins = new Player(
                "Hassan Haskins",
                "Tennessee Titans",
                "RB",
                "https://www.tennesseetitans.com/team/players-roster/hassan-haskins/",
                "titans",
                "",
                "https://www.instagram.com/h2_2535/?hl=en",
                "https://x.com/h2_3125?lang=en"
            );

            Player frozone = new Player(
                "Mike Sainristil",
                "Washington Commanders",
                "CB",
                "https://www.commanders.com/team/players-roster/mike-sainristil/",
                "commies",
                "",
                "https://www.instagram.com/mikesainristil/?hl=en",
                "https://x.com/MikeSainristil"
            );

            playerRepo.saveAll(List.of(ojabo, ross, barrett, evans, hill, jenkins, robbins, turnerii, bush, gray, hurst, zinter, lewis, schoony, mazi, glasgow, hutch, mckeon, dpj, turner, gary, green, collins, henderson, mcgrone, danna, paye, barnhart, colson, hinton, cojo, mason, corum, wallace, gentry, hayes, jj, metellus, owenu, jabrill, stueber, uche, hudson, ruiz, longjr, mayfield, runyan, mcgregor, graham, keegan, wilson, barner, morris, olu, bell, moody, nugent, thomas, bredeson, harrell, haskins, frozone));

        };

    }
}
