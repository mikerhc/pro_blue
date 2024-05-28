import React, { useState } from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faChevronDown, faChevronUp } from '@fortawesome/free-solid-svg-icons';
import "./index.scss";
import { Link } from 'react-router-dom';


const TeamCards = ({ playerData, teamData }) => {
    const [expandedTeam, setExpandedTeam] = useState(null);

    const countPlayersOnTeam = (teamName) => {
        const teamPlayers = playerData.filter(team => team.team === teamName);
        return teamPlayers.length;
    };

    const toggleExpand = (teamId) => {
        setExpandedTeam(expandedTeam === teamId ? null : teamId);
    };

    //console.log(%PUBLIC_URL%)

    return (
      <div className='team-card-container'>
        {teamData.map((team) => (
          <div
            className={`team-card ${expandedTeam === team.id ? 'expanded' : ''}`}
            key={team.name}
            onClick={() => toggleExpand(team.id)}
          >
            <div className='team-info'>
              <img src={team.imageUrl} alt={`${team.name} logo`} />
              <div className='team-name'>{team.name}</div>
            </div>
            {expandedTeam !== team.id && (
              <div className='arrow-icon-down'>
                <FontAwesomeIcon icon={faChevronDown} />
              </div>
            )}
            {expandedTeam === team.id && (
              <div className='team-players'>
                {playerData.filter(player => player.team === team.name).map(player => (
                  <Link to={player.rosterUrl} key={player.id} className='player-info'>
                    <div>{player.name}, {player.position}</div>
                  </Link>
                ))}
                <Link to={`/team/${team.url}`} className='view-team-button'>
                  View Team
                </Link>
              </div>
            )}
          </div>
        ))}
      </div>
    );
};

export default TeamCards;
