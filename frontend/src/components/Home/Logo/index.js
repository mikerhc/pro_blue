import Natty from '../../../assets/natty_logo.png';
import './index.scss';

const Logo = () => {

  return (
    <div className="logo-container">
      <img className="solid-logo animate" src={Natty} alt="National Champions" />
    </div>
  );
};

export default Logo;