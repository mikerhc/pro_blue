import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './App.css';
import Layout from "./components/Layout";
import Home from "./components/Home";
import Search from './components/Search';
import { useEffect, useState } from 'react';
import TeamPage from './components/TeamPage';

//import team logos
/*
import ravens from './assets/teams/ravens.png';
import panthers from './assets/teams/panther.png';
import bengals from './assets/teams/bengals.png';
import browns from './assets/teams/browns.png';
import cowboys from './assets/teams/cowboys.png';
import lions from './assets/teams/lions.png';
import pack from './assets/teams/pack.png';
import texans from './assets/teams/texans.png';
import colts from './assets/teams/colts.png';
import chiefs from './assets/teams/chiefs.png';
import chargers from './assets/teams/chargers.png';
import rams from './assets/teams/rams.png';
import raiders from './assets/teams/raiders.png';
import phins from './assets/teams/phins.png';
import viks from './assets/teams/viks.png';
import pats from './assets/teams/pats.png';
import saints from './assets/teams/saints.png';
import giants from './assets/teams/giants.png';
import jets from './assets/teams/jets.png';
import eagles from './assets/teams/eagles.png';
import steelers from './assets/teams/steelers.png';
import seahawks from './assets/teams/seahawks.png';
import niners from './assets/teams/niners.png';
import bucs from './assets/teams/bucs.png';
import titans from './assets/teams/titans.png';
import commies from './assets/teams/commies.png';

const teams = [
  {id: 1, name: "Baltimore Ravens", imageUrl: ravens, url: "ravens"},
  {id: 2, name: "Carolina Panthers", imageUrl: panthers, url: "ravens"},
  {id: 3, name: "Cincinnati Bengals", imageUrl: bengals, url: "ravens"},
  {id: 4, name: "Cleveland Browns", imageUrl: browns, url: "ravens"},
  {id: 5, name: "Dallas Cowboys", imageUrl: cowboys, url: "ravens"},
  {id: 6, name: "Detroit Lions", imageUrl: lions, url: "ravens"},
  {id: 7, name: "Green Bay Packers", imageUrl: pack, url: "ravens"},
  {id: 8, name: "Houston Texans", imageUrl: texans, url: "ravens"},
  {id: 9, name: "Indianapolis Colts", imageUrl: colts, url: "ravens"},
  {id: 10, name: "Kansas City Chiefs", imageUrl: chiefs, url: "ravens"},
  {id: 11, name: "Los Angeles Chargers", imageUrl: chargers, url: "ravens"},
  {id: 12, name: "Los Angeles Rams", imageUrl: rams, url: "ravens"},
  {id: 13, name: "Las Vegas Raiders", imageUrl: raiders, url: "ravens"},
  {id: 14, name: "Miami Dolphins", imageUrl: phins, url: "ravens"},
  {id: 15, name: "Minnesota Vikings", imageUrl: viks, url: "ravens"},
  {id: 16, name: "New England Patriots", imageUrl: pats, url: "ravens"},
  {id: 17, name: "New Orleans Saints", imageUrl: saints, url: "ravens"},
  {id: 18, name: "New York Giants", imageUrl: giants, url: "ravens"},
  {id: 19, name: "New York Jets", imageUrl: jets, url: "ravens"},
  {id: 20, name: "Philadelphia Eagles", imageUrl: eagles, url: "ravens"},
  {id: 21, name: "Pittsburgh Steelers", imageUrl: steelers, url: "ravens"},
  {id: 22, name: "Seattle Seahawks", imageUrl: seahawks, url: "ravens"},
  {id: 23, name: "San Francisco 49ers", imageUrl: niners, url: "ravens"},
  {id: 24, name: "Tampa Bay Buccaneers", imageUrl: bucs, url: "ravens"},
  {id: 25, name: "Tennessee Titans", imageUrl: titans, url: "ravens"},
  {id: 26, name: "Washington Commanders", imageUrl: commies, url: "ravens"}
];
*/

function App() {
const [playerData, setPlayerData] = useState([]);
const [teamData, setTeamData] = useState([]);
const [error, setError] = useState([]);

useEffect(() => {
  const fetchPlayerData = async() => {
    try{
      const response = await fetch('http://localhost:8080/api/v1/player')
      if (!response.ok){
        throw new Error("Failed to fetch player data");
      }
      const responseData = await response.json();
      //console.log(typeof(responseData));
      //console.log(responseData);
      setPlayerData(responseData);
    } catch(error){
      console.error("Error getting player data");
      setError(error.message || 'An error occurred');
    }
  };

  const fetchTeamData = async() => {
    try{
      const response = await fetch('http://localhost:8080/api/v1/team')
      if (!response.ok){
        throw new Error("Failed to fetch team data");
      }
      const responseData = await response.json();
      //console.log(typeof(responseData));
      //console.log(responseData);
      setTeamData(responseData);
    } catch(error){
      console.error("Error getting team data");
      setError(error.message || 'An error occurred');
    }
  };

  fetchPlayerData();
  fetchTeamData();

}, []);

  return (
    <Router>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home teamData={teamData}/>}/>
          <Route path="search" element={<Search playerData={playerData} teamData={teamData}/>}/>
          <Route path="team/:teamName" element={<TeamPage playerData={playerData} teamData={teamData}/>}/>
        </Route>
      </Routes>
    </Router>
  );
}

export default App;
