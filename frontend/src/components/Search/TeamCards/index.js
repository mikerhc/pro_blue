import React, { useState } from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faChevronDown } from '@fortawesome/free-solid-svg-icons';
import "./index.scss";
import { Link } from 'react-router-dom';
//set dynamic image paths
const images = require.context('../../../assets/teams', true, /\.png$/);
//actually get the images
const getImage = (teamName) => images(`./${teamName}/${teamName}.png`);


const TeamCards = ({ playerData, teamData }) => {
    const [expandedTeam, setExpandedTeam] = useState(null);

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
              <img src={getImage(team.url)} alt={`${team.name} logo`} />
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
