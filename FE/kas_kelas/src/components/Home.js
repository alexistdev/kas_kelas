import React from 'react'
import { useState, useEffect } from 'react';
import axios from 'axios';
import { Link, redirect } from 'react-router-dom';

function Home() {
  return ( 

   <div className="content-wrapper">
  {/* Content Header (Page header) */}
  <section className="content-header">
    <div className="container-fluid">
      <div className="row mb-2">
        <div className="col-sm-6">
          <h1>Selamat Datang</h1>
        </div>
  
      </div>
    </div>{/* /.container-fluid */}
  </section>
  {/* Main content */}
  <section className="content">
    {/* Default box */}
    <div className="card">
      <div className="card-header">
        <h3 className="card-title">Title</h3>
        <div className="card-tools">
          <button type="button" className="btn btn-tool" data-card-widget="collapse" title="Collapse">
            <i className="fas fa-minus" />
          </button>
         
        </div>
      </div>
      <div className="card-body">
        Start creating your amazing application!
      </div>
      {/* /.card-body */}
      </div>
    {/* /.card */}
  </section>
  {/* /.content */}
</div>


  )
}

export default Home