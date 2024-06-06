const teamData = [
    {
      "id": 1,
      "name": "Baltimore Ravens",
      "imageUrl": "CDN_when_i_deploy/ravens.png",
      "url": "ravens",
      "espnId": 33,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_33_%2542altimore%2B%2552avens%23sports@group.v.calendar.google.com"
    },
    {
      "id": 2,
      "name": "Carolina Panthers",
      "imageUrl": "CDN_when_i_deploy/panthers.png",
      "url": "panthers",
      "espnId": 29,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_29_%2543arolina%2B%2550anthers%23sports@group.v.calendar.google.com"
    },
    {
      "id": 3,
      "name": "Cincinnati Bengals",
      "imageUrl": "CDN_when_i_deploy/bengals.png",
      "url": "bengals",
      "espnId": 4,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_4_%2543incinnati%2B%2542engals%23sports@group.v.calendar.google.com"
    },
    {
      "id": 4,
      "name": "Cleveland Browns",
      "imageUrl": "CDN_when_i_deploy/browns.png",
      "url": "browns",
      "espnId": 5,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_5_%2543leveland%2B%2542rowns%23sports@group.v.calendar.google.com"
    },
    {
      "id": 5,
      "name": "Dallas Cowboys",
      "imageUrl": "CDN_when_i_deploy/cowboys.png",
      "url": "cowboys",
      "espnId": 6,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_6_%2544allas%2B%2543owboys%23sports@group.v.calendar.google.com"
    },
    {
      "id": 6,
      "name": "Detroit Lions",
      "imageUrl": "CDN_when_i_deploy/lions.png",
      "url": "lions",
      "espnId": 8,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_8_%2544etroit%2B%254cions%23sports@group.v.calendar.google.com"
    },
    {
      "id": 7,
      "name": "Green Bay Packers",
      "imageUrl": "CDN_when_i_deploy/pack.png",
      "url": "packers",
      "espnId": 9,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_9_%2547reen%2B%2542ay%2B%2550ackers%23sports@group.v.calendar.google.com"
    },
    {
      "id": 8,
      "name": "Houston Texans",
      "imageUrl": "CDN_when_i_deploy/texans.png",
      "url": "texans",
      "espnId": 34,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_34_%2548ouston%2B%2554exans%23sports@group.v.calendar.google.com"
    },
    {
      "id": 9,
      "name": "Indianapolis Colts",
      "imageUrl": "CDN_when_i_deploy/colts.png",
      "url": "colts",
      "espnId": 11,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_11_%2549ndianapolis%2B%2543olts%23sports@group.v.calendar.google.com"
    },
    {
      "id": 10,
      "name": "Kansas City Chiefs",
      "imageUrl": "CDN_when_i_deploy/chiefs.png",
      "url": "chiefs",
      "espnId": 12,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_12_%254bansas%2B%2543ity%2B%2543hiefs%23sports@group.v.calendar.google.com"
    },
    {
      "id": 11,
      "name": "Los Angeles Chargers",
      "imageUrl": "CDN_when_i_deploy/chargers.png",
      "url": "chargers",
      "espnId": 24,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_24_%254cos%2B%2541ngeles%2B%2543hargers%23sports@group.v.calendar.google.com"
    },
    {
      "id": 12,
      "name": "Los Angeles Rams",
      "imageUrl": "CDN_when_i_deploy/rams.png",
      "url": "rams",
      "espnId": 14,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_14_%254cos%2B%2541ngeles%2B%2552ams%23sports@group.v.calendar.google.com"
    },
    {
      "id": 13,
      "name": "Las Vegas Raiders",
      "imageUrl": "CDN_when_i_deploy/raiders.png",
      "url": "raiders",
      "espnId": 13,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_13_%254cas%2B%2556egas%2B%2552aiders%23sports@group.v.calendar.google.com"
    },
    {
      "id": 14,
      "name": "Miami Dolphins",
      "imageUrl": "CDN_when_i_deploy/phins.png",
      "url": "dolphins",
      "espnId": 15,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_15_%254diami%2B%2544olphins%23sports@group.v.calendar.google.com"
    },
    {
      "id": 15,
      "name": "Minnesota Vikings",
      "imageUrl": "CDN_when_i_deploy/viks.png",
      "url": "vikings",
      "espnId": 16,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_16_%254dinnesota%2B%2556ikings%23sports@group.v.calendar.google.com"
    },
    {
      "id": 16,
      "name": "New England Patriots",
      "imageUrl": "CDN_when_i_deploy/pats.png",
      "url": "patriots",
      "espnId": 17,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_17_%254eew%2B%2545ngland%2B%2550atriots%23sports@group.v.calendar.google.com"
    },
    {
      "id": 17,
      "name": "New Orleans Saints",
      "imageUrl": "CDN_when_i_deploy/saints.png",
      "url": "saints",
      "espnId": 18,
      "gcal": ""
    },
    {
      "id": 18,
      "name": "New York Giants",
      "imageUrl": "CDN_when_i_deploy/giants.png",
      "url": "giants",
      "espnId": 19,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_19_%254eew%2B%2559ork%2B%2547iants%23sports@group.v.calendar.google.com"
    },
    {
      "id": 19,
      "name": "New York Jets",
      "imageUrl": "CDN_when_i_deploy/jets.png",
      "url": "jets",
      "espnId": 20,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_20_%254eew%2B%2559ork%2B%254aets%23sports@group.v.calendar.google.com"
    },
    {
      "id": 20,
      "name": "Philadelphia Eagles",
      "imageUrl": "CDN_when_i_deploy/eagles.png",
      "url": "eagles",
      "espnId": 21,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_21_%2550hiladelphia%2B%2545agles%23sports@group.v.calendar.google.com"
    },
    {
      "id": 21,
      "name": "Pittsburgh Steelers",
      "imageUrl": "CDN_when_i_deploy/steelers.png",
      "url": "steelers",
      "espnId": 23,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_23_%2550ittsburgh%2B%2553teelers%23sports@group.v.calendar.google.com"
    },
    {
      "id": 22,
      "name": "Seattle Seahawks",
      "imageUrl": "CDN_when_i_deploy/seahawks.png",
      "url": "seahawks",
      "espnId": 26,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_26_%2553eattle%2B%2553eahawks%23sports@group.v.calendar.google.com"
    },
    {
      "id": 23,
      "name": "San Francisco 49ers",
      "imageUrl": "CDN_when_i_deploy/niners.png",
      "url": "niners",
      "espnId": 25,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_25_%2553an%2B%2546rancisco%2B49ers%23sports@group.v.calendar.google.com"
    },
    {
      "id": 24,
      "name": "Tampa Bay Buccaneers",
      "imageUrl": "CDN_when_i_deploy/bucs.png",
      "url": "buccaneers",
      "espnId": 27,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_27_%2554ampa%2B%2542ay%2B%2542uccaneers%23sports@group.v.calendar.google.com"
    },
    {
      "id": 25,
      "name": "Tennessee Titans",
      "imageUrl": "CDN_when_i_deploy/titans.png",
      "url": "titans",
      "espnId": 10,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_10_%2554ennessee%2B%2554itans%23sports@group.v.calendar.google.com"
    },
    {
      "id": 26,
      "name": "Washington Commanders",
      "imageUrl": "CDN_when_i_deploy/commies.png",
      "url": "commies",
      "espnId": 28,
      "gcal": "https://calendar.google.com/calendar/u/0/r?cid=nfl_28_%2557ashington%2B%2543ommanders%23sports@group.v.calendar.google.com"
    }
  ];

/*
useEffect(() => {
  const fetchPlayerData = async() => {
    try{
      const response = await fetch('https://pro-blue-2kwj7g2p4a-ue.a.run.app/api/v1/player')
      if (!response.ok){
        throw new Error("Failed to fetch player data");
      }
      const responseData = await response.json();
      //console.log(typeof(responseData));
      //console.log(responseData);
      setPlayerData(responseData);
    } catch(error){
      console.error("Error getting player data");
    }
  };

  const fetchTeamData = async() => {
    try{
      const response = await fetch('https://pro-blue-2kwj7g2p4a-ue.a.run.app/api/v1/team')
      if (!response.ok){
        throw new Error("Failed to fetch team data");
      }
      const responseData = await response.json();
      //console.log(typeof(responseData));
      //console.log(responseData);
      setTeamData(responseData);
    } catch(error){
      console.error("Error getting team data");
    }
  };

  fetchPlayerData();
  fetchTeamData();

}, []);
*/

export default teamData;

