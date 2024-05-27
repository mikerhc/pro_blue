import './index.scss'
import { Link, NavLink } from "react-router-dom"
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faHome, faSearch, faCalendar, faEnvelope, faClose, faBars } from '@fortawesome/free-solid-svg-icons'
import MLogo from "../../assets/logos/block_m.png";
import { useState } from 'react'

const Navbar = () => {
    const [showNav, setShowNav] = useState(false)

    const closeNav = () => {
        setShowNav(false);
    };


    return (
        <div className='nav-bar'>
            <Link className="logo" to="/">
                <img src={MLogo} alt="logo" />
            </Link>
            <nav className={showNav ? 'mobile-show' : ""}>
                <NavLink exact="true" activeClassName="active" to="/search" onClick={closeNav}>
                    <FontAwesomeIcon icon={faSearch} />
                </NavLink>
            </nav>
        </div>
    )
}

export default Navbar;