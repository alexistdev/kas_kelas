import React, { useState } from 'react'
import axios from 'axios'
import { useNavigate } from 'react-router-dom';


function Login() {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [msg, setMsg] = useState([]);
    const navigate = useNavigate();


    const handleLogin = async (e) => {
        e.preventDefault();
        
        if(email === '' || password === '') {
            alert('Please enter your email and password')
        }


        try {
            await axios.post('http://192.168.100.2:8081/v1/api/auth', {
                email: email,
                password: password
            })
            console.log(email)
            navigate('/dashboard');
        } catch (error) {
            if (error.response) {
                setMsg(error.response.data.messages)
                console.log(error.response.data.messages)
            }
        }
    }

    return (
        <section className="sign-in">
            <div className="container">
                <div className="signin-content">


                    <div className="signin-form">
                        <h2 className="form-title">Login</h2>
                        <ul>{msg.map((message, index) => <li key={index}>{message}</li>)}</ul>
                        <form onSubmit={handleLogin}>
                            
                            {/* Email input */}
                            <div data-mdb-input-init className="form-outline mb-4">
                                <input type="email" 
                                value={email} 
                                onChange={(e) => setEmail(e.target.value)} 
                                name='email'
                                id="form2Example1" className="form-control" />
                                <label className="form-label" htmlFor="form2Example1">Email address</label>
                            </div>

                            {/* Password input */}
                            <div data-mdb-input-init className="form-outline mb-4">
                                <input type="password" 
                                    id="password" 
                                    value={password}
                                    onChange={(e) => setPassword(e.target.value)}
                                    name='password'
                                    className="form-control" />
                                <label className="form-label" htmlFor="form2Example2">Password</label>
                            </div>

                            {/* 2 column grid layout for inline styling */}
                            <div className="row mb-4">
                                <div className="col d-flex justify-content-center">
                                    {/* Checkbox */}
                                    <div className="form-check">
                                        <input className="form-check-input" type="checkbox" value="" id="form2Example31" defaultChecked />
                                        <label className="form-check-label" htmlFor="form2Example31"> Remember me </label>
                                    </div>
                                </div>

                                <div className="col">
                                    {/* Simple link */}
                                    <a href="#!">Forgot password?</a>
                                </div>
                            </div>

                            {/* Submit button */}
                            <button type="submit" data-mdb-button-init data-mdb-ripple-init className="btn btn-primary btn-block mb-4">Sign in</button>

                            {/* Register buttons */}
                            <div className="text-center">
                                <p>Not a member? <a href="#!">Register</a></p>
                                <p>or sign up with:</p>
                                <button type="button" data-mdb-button-init data-mdb-ripple-init className="btn btn-link btn-floating mx-1">
                                    <i className="fab fa-facebook-f"></i>
                                </button>

                                <button type="button" data-mdb-button-init data-mdb-ripple-init className="btn btn-link btn-floating mx-1">
                                    <i className="fab fa-google"></i>
                                </button>

                                <button type="button" data-mdb-button-init data-mdb-ripple-init className="btn btn-link btn-floating mx-1">
                                    <i className="fab fa-twitter"></i>
                                </button>

                                <button type="button" data-mdb-button-init data-mdb-ripple-init className="btn btn-link btn-floating mx-1">
                                    <i className="fab fa-github"></i>
                                </button>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </section>
    )
}

export default Login