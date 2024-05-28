import React, { useEffect, useState } from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faSearch } from '@fortawesome/free-solid-svg-icons';
import TeamCards from './TeamCards';
import "./index.scss";
import { Link } from 'react-router-dom';


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
              <img src={player.imageUrl} alt={player.name} />
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
