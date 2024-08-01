import React from 'react'
import Navbar from './Navbar.js'
import Footer from './Footer.js'

function Team() {
  return (
    <>
<Navbar />

  {/* Header Start */}
  <div className="container-fluid bg-primary mb-5">
    <div className="d-flex flex-column align-items-center justify-content-center" style={{minHeight: 400}}>
      <h3 className="display-3 font-weight-bold text-white">Our Teachers</h3>
      <div className="d-inline-flex text-white">
        <p className="m-0"><a className="text-white" href>Home</a></p>
        <p className="m-0 px-2">/</p>
        <p className="m-0">Our Teachers</p>
      </div>
    </div>
  </div>
  {/* Header End */}
  {/* Team Start */}
  <div className="container-fluid pt-5">
    <div className="container">
      <div className="text-center pb-2">
        <p className="section-title px-5"><span className="px-2">Our Teachers</span></p>
        <h1 className="mb-4">Meet Our Teachers</h1>
      </div>
      <div className="row">
        <div className="col-md-6 col-lg-3 text-center team mb-5">
          <div className="position-relative overflow-hidden mb-4" style={{borderRadius: '100%'}}>
            <img className="img-fluid w-100" src="img/team-1.jpg" alt />
            <div className="team-social d-flex align-items-center justify-content-center w-100 h-100 position-absolute">
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-twitter" /></a>
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-facebook-f" /></a>
              <a className="btn btn-outline-light text-center px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-linkedin-in" /></a>
            </div>
          </div>
          <h4>Julia Smith</h4>
          <i>Music Teacher</i>
        </div>
        <div className="col-md-6 col-lg-3 text-center team mb-5">
          <div className="position-relative overflow-hidden mb-4" style={{borderRadius: '100%'}}>
            <img className="img-fluid w-100" src="img/team-2.jpg" alt />
            <div className="team-social d-flex align-items-center justify-content-center w-100 h-100 position-absolute">
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-twitter" /></a>
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-facebook-f" /></a>
              <a className="btn btn-outline-light text-center px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-linkedin-in" /></a>
            </div>
          </div>
          <h4>Jhon Doe</h4>
          <i>Language Teacher</i>
        </div>
        <div className="col-md-6 col-lg-3 text-center team mb-5">
          <div className="position-relative overflow-hidden mb-4" style={{borderRadius: '100%'}}>
            <img className="img-fluid w-100" src="img/team-3.jpg" alt />
            <div className="team-social d-flex align-items-center justify-content-center w-100 h-100 position-absolute">
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-twitter" /></a>
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-facebook-f" /></a>
              <a className="btn btn-outline-light text-center px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-linkedin-in" /></a>
            </div>
          </div>
          <h4>Mollie Ross</h4>
          <i>Dance Teacher</i>
        </div>
        <div className="col-md-6 col-lg-3 text-center team mb-5">
          <div className="position-relative overflow-hidden mb-4" style={{borderRadius: '100%'}}>
            <img className="img-fluid w-100" src="img/team-4.jpg" alt />
            <div className="team-social d-flex align-items-center justify-content-center w-100 h-100 position-absolute">
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-twitter" /></a>
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-facebook-f" /></a>
              <a className="btn btn-outline-light text-center px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-linkedin-in" /></a>
            </div>
          </div>
          <h4>Donald John</h4>
          <i>Art Teacher</i>
        </div>
        <div className="col-md-6 col-lg-3 text-center team mb-5">
          <div className="position-relative overflow-hidden mb-4" style={{borderRadius: '100%'}}>
            <img className="img-fluid w-100" src="img/team-4.jpg" alt />
            <div className="team-social d-flex align-items-center justify-content-center w-100 h-100 position-absolute">
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-twitter" /></a>
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-facebook-f" /></a>
              <a className="btn btn-outline-light text-center px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-linkedin-in" /></a>
            </div>
          </div>
          <h4>Julia Smith</h4>
          <i>Music Teacher</i>
        </div>
        <div className="col-md-6 col-lg-3 text-center team mb-5">
          <div className="position-relative overflow-hidden mb-4" style={{borderRadius: '100%'}}>
            <img className="img-fluid w-100" src="img/team-3.jpg" alt />
            <div className="team-social d-flex align-items-center justify-content-center w-100 h-100 position-absolute">
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-twitter" /></a>
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-facebook-f" /></a>
              <a className="btn btn-outline-light text-center px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-linkedin-in" /></a>
            </div>
          </div>
          <h4>Jhon Doe</h4>
          <i>Language Teacher</i>
        </div>
        <div className="col-md-6 col-lg-3 text-center team mb-5">
          <div className="position-relative overflow-hidden mb-4" style={{borderRadius: '100%'}}>
            <img className="img-fluid w-100" src="img/team-2.jpg" alt />
            <div className="team-social d-flex align-items-center justify-content-center w-100 h-100 position-absolute">
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-twitter" /></a>
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-facebook-f" /></a>
              <a className="btn btn-outline-light text-center px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-linkedin-in" /></a>
            </div>
          </div>
          <h4>Mollie Ross</h4>
          <i>Dance Teacher</i>
        </div>
        <div className="col-md-6 col-lg-3 text-center team mb-5">
          <div className="position-relative overflow-hidden mb-4" style={{borderRadius: '100%'}}>
            <img className="img-fluid w-100" src="img/team-1.jpg" alt />
            <div className="team-social d-flex align-items-center justify-content-center w-100 h-100 position-absolute">
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-twitter" /></a>
              <a className="btn btn-outline-light text-center mr-2 px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-facebook-f" /></a>
              <a className="btn btn-outline-light text-center px-0" style={{width: 38, height: 38}} href="#"><i className="fab fa-linkedin-in" /></a>
            </div>
          </div>
          <h4>Donald John</h4>
          <i>Art Teacher</i>
        </div>
      </div>
    </div>
  </div>
  {/* Team End */}
  {/* Testimonial Start */}
  <div className="container-fluid py-5">
    <div className="container p-0">
      <div className="text-center pb-2">
        <p className="section-title px-5"><span className="px-2">Testimonial</span></p>
        <h1 className="mb-4">What Parents Say!</h1>
      </div>
      <div className="owl-carousel testimonial-carousel">

        <div className="testimonial-item px-3">
          <div className="bg-light shadow-sm rounded mb-4 p-4">
            <h3 className="fas fa-quote-left text-primary mr-3" />
            Sed ea amet kasd elitr stet, stet rebum et ipsum est duo elitr eirmod clita lorem. Dolor tempor ipsum clita
          </div>
          <div className="d-flex align-items-center">
            <img className="rounded-circle" src="img/testimonial-1.jpg" style={{width: 70, height: 70}} alt="Image" />
            <div className="pl-3">
              <h5>Parent Name</h5>
              <i>Profession</i>
            </div>
          </div>
        </div>
        <div className="testimonial-item px-3">
          <div className="bg-light shadow-sm rounded mb-4 p-4">
            <h3 className="fas fa-quote-left text-primary mr-3" />
            Sed ea amet kasd elitr stet, stet rebum et ipsum est duo elitr eirmod clita lorem. Dolor tempor ipsum clita
          </div>
          <div className="d-flex align-items-center">
            <img className="rounded-circle" src="img/testimonial-2.jpg" style={{width: 70, height: 70}} alt="Image" />
            <div className="pl-3">
              <h5>Parent Name</h5>
              <i>Profession</i>
            </div>
          </div>
        </div>
        <div className="testimonial-item px-3">
          <div className="bg-light shadow-sm rounded mb-4 p-4">
            <h3 className="fas fa-quote-left text-primary mr-3" />
            Sed ea amet kasd elitr stet, stet rebum et ipsum est duo elitr eirmod clita lorem. Dolor tempor ipsum clita
          </div>
          <div className="d-flex align-items-center">
            <img className="rounded-circle" src="img/testimonial-3.jpg" style={{width: 70, height: 70}} alt="Image" />
            <div className="pl-3">
              <h5>Parent Name</h5>
              <i>Profession</i>
            </div>
          </div>
        </div>
        <div className="testimonial-item px-3">
          <div className="bg-light shadow-sm rounded mb-4 p-4">
            <h3 className="fas fa-quote-left text-primary mr-3" />
            Sed ea amet kasd elitr stet, stet rebum et ipsum est duo elitr eirmod clita lorem. Dolor tempor ipsum clita
          </div>
          <div className="d-flex align-items-center">
            <img className="rounded-circle" src="img/testimonial-4.jpg" style={{width: 70, height: 70}} alt="Image" />
            <div className="pl-3">
              <h5>Parent Name</h5>
              <i>Profession</i>
            </div>
          </div>
      
        </div>
      
      </div>
     
    </div>
  </div>
  {/* Testimonial End */}

<Footer/>

    </>
  )
}

export default Team