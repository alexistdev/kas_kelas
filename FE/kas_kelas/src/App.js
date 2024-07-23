import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Login from './components/Login';
import './App.css';
import Register from './components/Register';

function App() {
  return (
    <Router>
      <div className="container mt-5">
        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          </Routes>
      </div>
    </Router>
  );
}

export default App;

