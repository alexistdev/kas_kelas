import React from 'react';
import { BrowserRouter as Router, Route, Routes, BrowserRouter } from 'react-router-dom';
import Login from './components/Login';
import './App.css';
import Register from './components/Register';
import Dashboard from './components/Dashboard';
import Home from './pages/Home';
import About from './pages/About';
import Team from './pages/Team';
import Gallery from './pages/Gallery';
import NoMatch from './components/NoMatch';
import KasKelas from './components/KasKelas';



function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} /> 
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path='/' element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="team" element={<Team />} />
        <Route path="gallery" element={<Gallery />} />
        <Route path="*" element={<NoMatch />} />
        <Route path='/transaksi' element={<KasKelas />} />
      </Routes>
      </BrowserRouter>



  );
}

export default App;

