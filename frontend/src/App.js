import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './App.css';
import Layout from "./components/Layout";
import Home from "./components/Home";
import Search from './components/Search';
import { useEffect, useState } from 'react';

function App() {
const [data, setData] = useState([]);
const [error, setError] = useState([]);

useEffect(() => {
  const fetchData = async() => {
    try{
      const response = await fetch('http://localhost:8080/api/v1/player')
      if (!response.ok){
        throw new Error("Failed to fetch player data");
      }
      const responseData = await response.json();
      //console.log(typeof(responseData));
      //console.log(responseData);
      setData(responseData);
    } catch(error){
      console.error("Error getting player data");
      setError(error.message || 'An error occurred');
    }
  };

  fetchData();
}, []);

  return (
    <Router>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home/>}/>
          <Route path="search" element={<Search data={data}/>}/>
        </Route>
      </Routes>
    </Router>
  );
}

export default App;
