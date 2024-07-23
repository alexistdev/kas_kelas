import React from 'react';
import { BrowserRouter as Router, Route, Routes, BrowserRouter } from 'react-router-dom';
import Login from './components/Login';
import './App.css';
import Register from './components/Register';
import Header from './components/Header';
import SideNav from './components/SideNav';
import Footer from './components/Footer';
import Home from './components/Home';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} /> 
        <Route 
          path="/"
          element={
            <div>
              <Header />
              <SideNav />
              <Home />
              <Footer />
            </div>
          }
          className="wrapper"

        />
      </Routes>
      </BrowserRouter>



  );
}

export default App;

