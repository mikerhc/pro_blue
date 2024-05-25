import React, { useState } from 'react';
import TeamCards from './TeamCards';
import "./index.scss";

const Search = ({ playerData, teamData }) => {
  const [searchTerm, setSearchTerm] = useState('');
  const [filteredData, setFilteredData] = useState([]);

  console.log(teamData);
  // Function to handle input change
  const handleInputChange = (e) => {
    const value = e.target.value;
    setSearchTerm(value);

    // Filter data based on search term
    const filteredResults = playerData.filter(item =>
      item.name.toLowerCase().includes(value.toLowerCase()) ||
      item.team.toLowerCase().includes(value.toLowerCase()) ||
      item.position.toLowerCase().includes(value.toLowerCase())
    );
    setFilteredData(filteredResults);
  };

  return (
    <TeamCards playerData={playerData} teamData={teamData}/>
  );
};

export default Search;
