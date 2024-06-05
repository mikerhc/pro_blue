import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './App.css';
import Layout from "./components/Layout";
import Home from "./components/Home";
import Search from './components/Search';
import { useEffect, useState } from 'react';
import TeamPage from './components/TeamPage';

function App() {
const [playerData, setPlayerData] = useState([]);
const [teamData, setTeamData] = useState([]);

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
