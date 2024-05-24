// src/playerService.js
const API_URL = 'http://localhost:8080/api/v1/player'; // Update with your actual backend URL

export const getPlayerData = async () => {
  try {
    const response = await fetch(API_URL);
    if (!response.ok) {
      throw new Error('Network response was not ok' + response.statusText);
    }
    const data = await response.json();
    return data;
  } catch (error) {
    console.error('Error fetching player data', error);
    throw error;
  }
};
