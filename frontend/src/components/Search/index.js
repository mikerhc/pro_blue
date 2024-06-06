import React, { useEffect, useState } from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faSearch } from '@fortawesome/free-solid-svg-icons';
import TeamCards from './TeamCards';
import "./index.scss";
import { Link } from 'react-router-dom';

//set dynamic image paths
const images = require.context('../../assets/teams', true, /\.png$/);
//actually get the images
const getPlayerImage = (teamName, playerName) => images(`./${teamName}/${playerName}.png`);

const getTeam =(teamName) => {
  //check if the team is the niners, only team with a number in their name
  if (teamName == 'San Francisco 49ers'){
    return 'niners';
  }
  else if (teamName == 'Washington Commanders'){
    return 'commies';
  }
  else{
    //split the team name into seperate words
    const arr = teamName.split((' '));
    //get the team mascot
    const name = arr[arr.length - 1];
    //make the first letter lowercase
    const finalName = name.charAt(0).toLowerCase() + name.slice(1);
    //return this name
    return finalName
  }

}

const Search = ({ playerData, teamData }) => {
  const [searchQuery, setSearchQuery] = useState('');
  const [filteredPlayers, setFilteredPlayers] = useState([]);

  // Function to handle input change
  useEffect(() => {
    setFilteredPlayers(
      playerData.filter(player =>
        player.name.toLowerCase().includes(searchQuery.toLowerCase())
      )
    );
  }, [searchQuery, playerData]);

  const handleSearchChange = (event) => {
    setSearchQuery(event.target.value);
  };


  return (
    <div className="search-page">
      <div className="search-box">
        <input
          type="text"
          placeholder="Search players..."
          value={searchQuery}
          onChange={handleSearchChange}
        />
        <button className="search-button">
          <FontAwesomeIcon icon={faSearch} />
        </button>
      </div>
      {searchQuery && filteredPlayers.length > 0 && (
        <div className="player-list">
          {filteredPlayers.map(player => (
            <Link to={`/team/${player.teamUrl}`} key={player.id} className="player-info">
              <img src={getPlayerImage(getTeam(player.team), player.imageUrl)} alt={player.name} />
              <div className='player-name'>{player.name}</div>
              <div className='player-team'>{player.team}</div>
              <div className='player-pos'>{player.position}</div>
            </Link>
          ))}
        </div>
      )}
    <TeamCards playerData={playerData} teamData={teamData}/>
    </div>
  );
};

export default Search;
