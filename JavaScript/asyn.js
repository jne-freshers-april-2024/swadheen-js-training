async function loadJson(url) {
    let response = await fetch(url); // Fetch data
    if (response.status === 200) {
      let json = await response.json(); // Parse JSON
      return json;
    }
    throw new Error(response.status); // Handle errors
  }
  
  try {
    let userData = await loadJson('/api/user');
    console.log('User data:', userData);
  } catch (error) {
    console.error('Error fetching data:', error);
  }
  