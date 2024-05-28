import React, { useEffect, useState} from 'react';
import { Link, useParams } from 'react-router-dom';
import './index.scss';
import x from '../../assets/logos/x.png';
import insta from '../../assets/logos/insta.png';

const TeamPage = ({ playerData, teamData }) => {
  const [scheduleData, setScheduleData] = useState([]);
  const { teamName } = useParams();
  const team = teamData.find(team => team.url === teamName);
  const players = playerData.filter(player => team.name === player.team);
  //console.log(players);

  useEffect(() => {
    const fetchNextGame = async() => {
      if(!team) return;
      try{
        const response = await fetch(`https://site.api.espn.com/apis/site/v2/sports/football/nfl/teams/${team.espnId}/schedule?season=2024`);
        if (!response.ok){
          throw new Error("Failed to fetch next game data");
        }
        const responseData = await response.json();
        //console.log(responseData);
        setScheduleData(responseData);
      }
      catch(error){
        console.error("Error getting schedule data");
      }
    };
    fetchNextGame();

  }, [team]);

  console.log(scheduleData);
  const today = new Date();
  let games = scheduleData.events;
  let stadium = "";
  let broadcast = "";
  let date = new Date()
  let time = "";
  if (games){
    games = games.filter(game => new Date(game.date) > today);
    //console.log(games);
    stadium = games[0].competitions[0].venue;
    //console.log(stadium);
    broadcast = games[0].competitions[0].broadcasts[0].media.shortName;
    //console.log(broadcast, region);
    date = new Date(games[0].date);
    time = date.toLocaleTimeString([], {hour: '2-digit', minute: '2-digit'});
    if (time[0] === '0'){
      time = time.slice(1);
    }

  }
  

  if (!team) {
    return <div>Team not found</div>;
  }
  return (
    <div className="team-page">
      <img src={team.imageUrl} alt={team.name} className='team-logo'/>
      <h1 className='team-name-page'>{team.name}</h1>
      <Link className='gcal-link' to={team.gcal}>Add the {team.name} Calendar!</Link>
      {games && (
        <div className='next-game-container'>
          <div className='next-game-date'>Next Game: {new Date (games[0].date).toLocaleDateString()} - {games[0].name} </div>
          <div className='next-game-staidum'>Stadium: {stadium.fullName} - {stadium.address.city}</div>
          <div className='next-game-tv'>TV: {broadcast}: {time}</div>
          </div>
      )}
      <div className="team-players">
        {players.map(player => (
          <div key={player.id} className="player-card">
            <img src={player.imageUrl} alt={player.name} className='player-pics'/>
            <div className='player-info'>
              <div>{player.name}</div>
              <div>{player.position}</div>
            </div>
            <div className='player-socials'>
              <a href={player.insta} className='insta'>
                <img src={insta} className='social-icon' alt='insta'/>
              </a>
              <a href={player.twitter} className='twitter'>
                <img src={x} className='social-icon' alt='twitter'/>
              </a>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default TeamPage;
