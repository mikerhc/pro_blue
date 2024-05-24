import React, { useState } from 'react';
import TeamCards from './Teams';
import "./index.scss";

const Search = ({ data }) => {
  const [searchTerm, setSearchTerm] = useState('');
  const [filteredData, setFilteredData] = useState([]);

  // Function to handle input change
  const handleInputChange = (e) => {
    const value = e.target.value;
    setSearchTerm(value);

    // Filter data based on search term
    const filteredResults = data.filter(item =>
      item.name.toLowerCase().includes(value.toLowerCase()) ||
      item.team.toLowerCase().includes(value.toLowerCase()) ||
      item.position.toLowerCase().includes(value.toLowerCase())
    );
    setFilteredData(filteredResults);
  };

  return (
    <TeamCards data={data}/>
  );
};

export default Search;
