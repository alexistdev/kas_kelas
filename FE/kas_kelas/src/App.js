import React from 'react';
import { BrowserRouter as Router, Route, Routes, BrowserRouter } from 'react-router-dom';
import Login from './components/Login';
import './App.css';
import Register from './components/Register';

import Dashboard from './components/Dashboard';


function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} /> 
        <Route path="/dashboard" element={<Dashboard />}  className="wrapper" />
      </Routes>
      </BrowserRouter>



  );
}

export default App;

