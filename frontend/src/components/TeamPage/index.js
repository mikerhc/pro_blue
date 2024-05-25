import React from 'react';
import { useParams } from 'react-router-dom';
import './index.scss';

const TeamPage = ({ playerData, teamData }) => {
  const { teamName } = useParams();
  console.log(teamData);
  const team = teamData.find(team => team.url === teamName);
  const players = playerData.filter(player => team.name === player.team);
  console.log(players);

  if (!team) {
    return <div>Team not found</div>;
  }

  return (
    <div className="team-page">
      <h1>{team.name}</h1>
      <div className="team-players">
        {players.map(player => (
          <div key={player.id} className="player-info">
            <div>{player.name}</div>
            <div>{player.position}</div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default TeamPage;
