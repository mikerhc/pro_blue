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
                "ravens",
                33,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_33_%2542altimore%2B%2552avens%23sports@group.v.calendar.google.com"
            );
            Team panthers = new Team (
                "Carolina Panthers",
                "CDN_when_i_deploy/panthers.png",
                "panthers",
                29,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_29_%2543arolina%2B%2550anthers%23sports@group.v.calendar.google.com"
            );
            Team bengals = new Team (
                "Cincinnati Bengals",
                "CDN_when_i_deploy/bengals.png",
                "bengals",
                4,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_4_%2543incinnati%2B%2542engals%23sports@group.v.calendar.google.com"
            );
            Team browns = new Team (
                "Cleveland Browns",
                "CDN_when_i_deploy/browns.png",
                "browns",
                5,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_5_%2543leveland%2B%2542rowns%23sports@group.v.calendar.google.com"
            );
            Team cowboys = new Team (
                "Dallas Cowboys",
                "CDN_when_i_deploy/cowboys.png",
                "cowboys",
                6,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_6_%2544allas%2B%2543owboys%23sports@group.v.calendar.google.com"
            );
            Team lions = new Team (
                "Detroit Lions",
                "CDN_when_i_deploy/lions.png",
                "lions",
                8,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_8_%2544etroit%2B%254cions%23sports@group.v.calendar.google.com"
            );
            Team packers = new Team (
                "Green Bay Packers",
                "CDN_when_i_deploy/pack.png",
                "packers",
                9,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_9_%2547reen%2B%2542ay%2B%2550ackers%23sports@group.v.calendar.google.com"
            );
            Team texans = new Team (
                "Houston Texans",
                "CDN_when_i_deploy/texans.png",
                "texans",
                34,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_34_%2548ouston%2B%2554exans%23sports@group.v.calendar.google.com"
            );
            Team colts = new Team (
                "Indianapolis Colts",
                "CDN_when_i_deploy/colts.png",
                "colts",
                11,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_11_%2549ndianapolis%2B%2543olts%23sports@group.v.calendar.google.com"
            );
            Team chiefs = new Team (
                "Kansas City Chiefs",
                "CDN_when_i_deploy/chiefs.png",
                "chiefs",
                12,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_12_%254bansas%2B%2543ity%2B%2543hiefs%23sports@group.v.calendar.google.com"
            );
            Team raiders = new Team (
                "Las Vegas Raiders",
                "CDN_when_i_deploy/raiders.png",
                "raiders",
                13,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_13_%254cas%2B%2556egas%2B%2552aiders%23sports@group.v.calendar.google.com"
            );
            Team chargers = new Team (
                "Los Angeles Chargers",
                "CDN_when_i_deploy/chargers.png",
                "chargers",
                24,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_24_%254cos%2B%2541ngeles%2B%2543hargers%23sports@group.v.calendar.google.com"
            );
            Team rams = new Team (
                "Los Angeles Rams",
                "CDN_when_i_deploy/rams.png",
                "rams",
                14,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_14_%254cos%2B%2541ngeles%2B%2552ams%23sports@group.v.calendar.google.com"
            );
            Team phins = new Team (
                "Miami Dolphins",
                "CDN_when_i_deploy/phins.png",
                "dolphins",
                15,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_15_%254diami%2B%2544olphins%23sports@group.v.calendar.google.com"
            );
            Team viks = new Team (
                "Minnesota Vikings",
                "CDN_when_i_deploy/viks.png",
                "vikings",
                16,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_16_%254dinnesota%2B%2556ikings%23sports@group.v.calendar.google.com"
            );
            Team pats = new Team (
                "New England Patriots",
                "CDN_when_i_deploy/pats.png",
                "patriots",
                17,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_17_%254eew%2B%2545ngland%2B%2550atriots%23sports@group.v.calendar.google.com"
            );
            Team saints = new Team (
                "New Orleans Saints",
                "CDN_when_i_deploy/saints.png",
                "saints",
                18,
                ""
            );
            Team giants = new Team (
                "New York Giants",
                "CDN_when_i_deploy/giants.png",
                "giants",
                19,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_19_%254eew%2B%2559ork%2B%2547iants%23sports@group.v.calendar.google.com"
            );
            Team jets = new Team (
                "New York Jets",
                "CDN_when_i_deploy/jets.png",
                "jets",
                20,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_20_%254eew%2B%2559ork%2B%254aets%23sports@group.v.calendar.google.com"
            );
            Team eagles = new Team (
                "Philadelphia Eagles",
                "CDN_when_i_deploy/eagles.png",
                "eagles",
                21,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_21_%2550hiladelphia%2B%2545agles%23sports@group.v.calendar.google.com"
            );
            Team steelers = new Team (
                "Pittsburgh Steelers",
                "CDN_when_i_deploy/steelers.png",
                "steelers",
                23,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_23_%2550ittsburgh%2B%2553teelers%23sports@group.v.calendar.google.com"
            );
            Team niners = new Team (
                "San Francisco 49ers",
                "CDN_when_i_deploy/niners.png",
                "niners",
                25,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_25_%2553an%2B%2546rancisco%2B49ers%23sports@group.v.calendar.google.com"
            );
            Team seahawks = new Team (
                "Seattle Seahawks",
                "CDN_when_i_deploy/seahawks.png",
                "seahawks",
                26,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_26_%2553eattle%2B%2553eahawks%23sports@group.v.calendar.google.com"
            );
            Team bucs = new Team (
                "Tampa Bay Buccaneers",
                "CDN_when_i_deploy/bucs.png",
                "buccaneers",
                27,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_27_%2554ampa%2B%2542ay%2B%2542uccaneers%23sports@group.v.calendar.google.com"
            );
            Team titans = new Team (
                "Tennessee Titans",
                "CDN_when_i_deploy/titans.png",
                "titans",
                10,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_10_%2554ennessee%2B%2554itans%23sports@group.v.calendar.google.com"
            );
            Team commies = new Team (
                "Washington Commanders",
                "CDN_when_i_deploy/commies.png",
                "commies",
                28,
                "https://calendar.google.com/calendar/u/0/r?cid=nfl_28_%2557ashington%2B%2543ommanders%23sports@group.v.calendar.google.com"
            );

            teamRepo.saveAll(List.of(ravens, panthers, bengals, browns, cowboys, lions, packers, texans, colts, chiefs, chargers, rams, raiders, phins, viks, pats, saints, giants, jets, eagles, steelers, seahawks, niners, bucs, titans, commies));
        };
    }

}
