import React, { useState } from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faChevronDown, faChevronUp } from '@fortawesome/free-solid-svg-icons';
import "./index.scss";
import { Link } from 'react-router-dom';
/*
const teams = [
    {id: 1, name: "Baltimore Ravens", imageUrl: ravens},
    {id: 2, name: "Carolina Panthers", imageUrl: panthers},
    {id: 3, name: "Cincinnati Bengals", imageUrl: bengals},
    {id: 4, name: "Cleveland Browns", imageUrl: browns},
    {id: 5, name: "Dallas Cowboys", imageUrl: cowboys},
    {id: 6, name: "Detroit Lions", imageUrl: lions},
    {id: 7, name: "Green Bay Packers", imageUrl: pack},
    {id: 8, name: "Houston Texans", imageUrl: texans},
    {id: 9, name: "Indianapolis Colts", imageUrl: colts},
    {id: 10, name: "Kansas City Chiefs", imageUrl: chiefs},
    {id: 11, name: "Los Angeles Chargers", imageUrl: chargers},
    {id: 12, name: "Los Angeles Rams", imageUrl: rams},
    {id: 13, name: "Las Vegas Raiders", imageUrl: raiders},
    {id: 14, name: "Miami Dolphins", imageUrl: phins},
    {id: 15, name: "Minnesota Vikings", imageUrl: viks},
    {id: 16, name: "New England Patriots", imageUrl: pats},
    {id: 17, name: "New Orleans Saints", imageUrl: saints},
    {id: 18, name: "New York Giants", imageUrl: giants},
    {id: 19, name: "New York Jets", imageUrl: jets},
    {id: 20, name: "Philadelphia Eagles", imageUrl: eagles},
    {id: 21, name: "Pittsburgh Steelers", imageUrl: steelers},
    {id: 22, name: "Seattle Seahawks", imageUrl: seahawks},
    {id: 23, name: "San Francisco 49ers", imageUrl: niners},
    {id: 24, name: "Tampa Bay Buccaneers", imageUrl: bucs},
    {id: 25, name: "Tennessee Titans", imageUrl: titans},
    {id: 26, name: "Washington Commanders", imageUrl: commies}
];
*/

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
            <div className='arrow-icon'>
              <FontAwesomeIcon icon={expandedTeam === team.id ? faChevronUp : faChevronDown} />
            </div>
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
