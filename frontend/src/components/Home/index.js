import { Link } from "react-router-dom";
import "./index.scss";
import Logo from "./Logo";

import blake from '../../assets/blake.png';
import brandon from '../../assets/brandon.png';
import mikey from '../../assets/frozone.png';
import hutch from '../../assets/hutch.png';
import jabrill from '../../assets/jabrill.png';
import jj from '../../assets/jj.png';
import kris from '../../assets/kris.png';
import moody from '../../assets/moody.png';
import nico from '../../assets/nico.png';
import rashan from '../../assets/rashan.png';
import junior from '../../assets/junior.png';
import dpj from '../../assets/dpj.png';

const players = [
    {id: 1, name: "Blake Corum", team: "Los Angeles Rams", position: "RB", imageUrl: blake},
    {id: 2, name: "Brandon Graham", team: "Philadelphia Eagles", position: "DE", imageUrl: brandon},
    {id: 3, name: "Mikey Sainristil", team: "Washington Commanders", position: "CB", imageUrl: mikey},
    {id: 4, name: "Aidan Hutchinson", team: "Detroit Lions", position: "DE", imageUrl: hutch},
    {id: 5, name: "Jabrill Peppers", team: "New England Patriots", position: "S", imageUrl: jabrill},
    {id: 6, name: "JJ McCarthy", team: "Minnesota Vikings", position: "QB", imageUrl: jj},
    {id: 7, name: "Kris Jenkins", team: "Cincinnati Bengals", position: "DT", imageUrl: kris},
    {id: 8, name: "Jake Moody", team: "San Francisco 49ers", position: "K", imageUrl: moody},
    {id: 9, name: "Nico Collins", team: "Houston Texans", position: "WR", imageUrl: nico},
    {id: 10, name: "Rashan Gary", team: "Green Bay Packers", position: "DE", imageUrl: rashan},
    {id: 11, name: "Junior Colson", team: "Los Angeles Chargers", position: "LB", imageUrl: junior},
    {id: 12, name: "Donovan Peoples-Jones", team: "Detroit Lions", position: "WR", imageUrl: dpj}
];
const Home = () => {
    return(
        <>
            <div className = "home-page">
                <div className = "text-zone">
                    <h1>Michigan Football Players in the NFL</h1>
                    <h2>Explore your favorite Michigan Alumni in the NFL</h2> 
                    <h2>See upcoming games, stats, and add their games to your calendar!</h2>
                    <Link to="/search" className="flat-button">GET STARTED</Link>
                </div>
                <Logo className="Home"/>
                <div className="player-card-container">
                    {players.map((player) => (
                        <Link to={`teams/player.team`}key={player.id} className="player-card">
                            <img src={player.imageUrl} alt={player.name}/>
                            <div>{player.name}</div>
                            <div>{player.team}</div>
                            <div>{player.position}</div>
                        </Link>
                    ))}
                    {players.map((player) => (
                        <Link to={`teams/player.team`}key={player.id} className="player-card">
                            <img src={player.imageUrl} alt={player.name}/>
                            <div>{player.name}</div>
                            <div>{player.team}</div>
                            <div>{player.position}</div>
                        </Link>
                    ))}
                    
                </div>
            </div>
        </>
    )
}

export default Home