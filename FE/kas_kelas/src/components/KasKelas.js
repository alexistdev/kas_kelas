import React from 'react'
import Navbar from './Navbar'
import Footer from './Footer'
import ContentKasKelas from './ContentKasKelas'

import { useEffect } from 'react';
import { useNavigate } from 'react-router-dom'



function KasKelas() {
  const navigate = useNavigate();

  useEffect(() => {
    if (!localStorage.getItem("token") && !localStorage.getItem("id")) {
      navigate("/login");
    }
  }, []);


  return (
    <div className="wrapper">

      <Navbar />
      <ContentKasKelas />
      <Footer />
    </div>
  )
}

export default KasKelas