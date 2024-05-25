import React, { useState } from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faChevronDown, faChevronUp } from '@fortawesome/free-solid-svg-icons';
import "./index.scss";

import ravens from '../../../assets/teams/ravens.png';
import panthers from '../../../assets/teams/panther.png';
import bengals from '../../../assets/teams/bengals.png';
import browns from '../../../assets/teams/browns.png';
import cowboys from '../../../assets/teams/cowboys.png';
import lions from '../../../assets/teams/lions.png';
import pack from '../../../assets/teams/pack.png';
import texans from '../../../assets/teams/texans.png';
import colts from '../../../assets/teams/colts.png';
import chiefs from '../../../assets/teams/chiefs.png';
import chargers from '../../../assets/teams/chargers.png';
import rams from '../../../assets/teams/rams.png';
import raiders from '../../../assets/teams/raiders.png';
import phins from '../../../assets/teams/phins.png';
import viks from '../../../assets/teams/viks.png';
import pats from '../../../assets/teams/pats.png';
import saints from '../../../assets/teams/saints.png';
import giants from '../../../assets/teams/giants.png';
import jets from '../../../assets/teams/jets.png';
import eagles from '../../../assets/teams/eagles.png';
import steelers from '../../../assets/teams/steelers.png';
import seahawks from '../../../assets/teams/seahawks.png';
import niners from '../../../assets/teams/niners.png';
import bucs from '../../../assets/teams/bucs.png';
import titans from '../../../assets/teams/titans.png';
import commies from '../../../assets/teams/commies.png';

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

const TeamCards = ({ data }) => {
    const [expandedTeam, setExpandedTeam] = useState(null);

    const countPlayersOnTeam = (teamName) => {
        const teamPlayers = data.filter(team => team.team === teamName);
        return teamPlayers.length;
    };

    const toggleExpand = (teamId) => {
        setExpandedTeam(expandedTeam === teamId ? null : teamId);
    };

    return (
      <div className='team-card-container'>
        {teams.map((team) => (
          <div
            className={`team-card ${expandedTeam === team.id ? 'expanded' : ''}`}
            key={team.name}
            onClick={() => toggleExpand(team.id)}
          >
            <div className='team-info'>
              <img src={team.imageUrl} alt={`${team.name} logo`} />
              <div className='team-name'>{team.name}</div>
            </div>
            <div className='player-count'>{countPlayersOnTeam(team.name)} Michigan</div>
            <div className='arrow-icon'>
              <FontAwesomeIcon icon={expandedTeam === team.id ? faChevronUp : faChevronDown} />
            </div>
            {expandedTeam === team.id && (
              <div className='team-players'>
                {data.filter(player => player.team === team.name).map(player => (
                  <div key={player.id} className='player-info'>
                    <div>{player.name}</div>
                    <div>{player.position}</div>
                    <div>{player.number}</div>
                  </div>
                ))}
              </div>
            )}
          </div>
        ))}
      </div>
    );
};

export default TeamCards;
