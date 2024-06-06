import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './App.css';
import Layout from "./components/Layout";
import Home from "./components/Home";
import Search from './components/Search';
//import { useEffect, useState } from 'react';
import TeamPage from './components/TeamPage';
import playerData from './components/Data/player.js'
import teamData from './components/Data/team.js'
console.log(playerData);

function App() {
//const [playerData, setPlayerData] = useState([]);
//const [teamData, setTeamData] = useState([]);


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
