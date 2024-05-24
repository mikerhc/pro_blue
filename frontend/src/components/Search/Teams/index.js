import React, { useState } from 'react';
import "./index.scss";

const teams = [
    {id: 1, name: "Baltimore Ravens"},
    {id: 2, name: "Carolina Panthers"},
    {id: 3, name: "Cincinnati Bengals"},
    {id: 4, name: "Cleveland Browns"},
    {id: 5, name: "Dallas Cowboys"},
    {id: 6, name: "Detroit Lions"},
    {id: 7, name: "Green Bay Packers"},
    {id: 8, name: "Houston Texans"},
    {id: 9, name: "Indianapolis Colts"},
    {id: 10, name: "Kansas City Chiefs"},
    {id: 11, name: "Los Angeles Chargers"},
    {id: 12, name: "Los Angeles Rams"},
    {id: 13, name: "Las Vegas Raiders"},
    {id: 14, name: "Miami Dolphins"},
    {id: 15, name: "Minnesota Vikings"},
    {id: 16, name: "New England Patriots"},
    {id: 17, name: "New Orleans Saints"},
    {id: 18, name: "New York Giants"},
    {id: 19, name: "New York Jets"},
    {id: 20, name: "Philadelphia Eagles"},
    {id: 21, name: "Pittsburgh Steelers"},
    {id: 22, name: "Seattle Seahawks"},
    {id: 23, name: "San Francisco 49ers"},
    {id: 24, name: "Tampa Bay Buccaneers"},
    {id: 25, name: "Tennessee Titans"},
    {id: 26, name: "Washington Commanders"}
]

const TeamCards = ({ data }) => {

    const countPlayersOnTeam = (teamName) => {
        // Filter players based on the team ID
        const teamPlayers = data.filter(team => team.team === teamName);
        return teamPlayers.length;
      };
    return (
      <div className='team-card-container'>
        {teams.map((team) => (
            <div className='team-card'>
                <div>{team.name}</div>
                <div>{countPlayersOnTeam(team.name)}</div>
            </div>
        ))}
      </div>
    );
};

export default TeamCards;
