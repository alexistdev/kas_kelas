import React, { useState , useEffect} from 'react'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'
import Header from './Header'
import SideNav from './SideNav'
import Home from './Home'
import Footer from './Footer'

function Dashboard() {
const navigate = useNavigate();

    useEffect(() => {
        if (!localStorage.getItem("token") && !localStorage.getItem("id")) {
            navigate("/login");
        }
    }, []);

  return (
      <div>
        <Header />
        <SideNav />
        <Home />
        <Footer />
      </div>

  )
}

export default Dashboard