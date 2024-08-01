import React from 'react'

function Navbar() {
  return (    
      <div className="container-fluid bg-light position-relative shadow">
          <nav className="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0 px-lg-5">
              <a href="/" className="navbar-brand font-weight-bold text-secondary" style={{ fontSize: 50 }}>
                  <i className="flaticon-043-teddy-bear" />
                  <span className="text-primary">SDN CILELES</span>
              </a>
              <button type="button" className="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                  <span className="navbar-toggler-icon" />
              </button>
              <div className="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                  <div className="navbar-nav font-weight-bold mx-auto py-0">
                      <a href="/" className="nav-item nav-link active">Home</a>
                      <a href="/about" className="nav-item nav-link">About</a>
                      <a href="/team" className="nav-item nav-link">Teachers</a>
                      <a href="/gallery" className="nav-item nav-link">Gallery</a>
                      <a href="contact.html" className="nav-item nav-link">Contact</a>
                  </div>
                  <a href="/login" className="btn btn-primary px-4">Join Class</a>
              </div>
          </nav>
      </div>
  )
}

export default Navbar