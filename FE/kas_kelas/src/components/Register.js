import React from "react";
import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

const Register = () => {
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confPassword, setconfPassword] = useState("");
    const [msg, setMsg] = useState([]);
    let [warning, setWarning] = useState("form-control");

    const navigate = useNavigate();

    const heandleRegister = async (e) => {
        e.preventDefault();
    
        if(password !== confPassword){
            setWarning("form-control is-invalid");
            setMsg("password not match");
            return;
        }
        try {
            await axios.post("http://192.168.100.2:8081/v1/api/users", {
                //data yang ingin kita submit
                name: name,
                email: email,
                password: password,
                confPassword: confPassword,
            });
            navigate("/login");
        } catch (error) {
            if (error.response) {
                setMsg([error.response.data.messages]);
                setWarning("form-control is-invalid");
            }
        }
    };

    function checkPassword(value){
        if (value !== ""){
            if (password !== value) {
                setWarning("form-control is-invalid");
                setMsg(["password not match"]);
                return false;
            }
            setconfPassword(value);
            setWarning("form-control is-valid");
            setMsg([""]);
            return true;
        }
        return true;
        
    }

    return (
        <div className="row align-items-center">
            <div className="col-md-4 offset-md-4">
                <div className=" justify-content-between">
                    <div className="login-logo">
                        <h3>Register</h3>
                    </div>
                    {/* /.login-logo */}
                    <div className="card">
                        <div className="card-body login-card-body">
                            <p className="login-box-msg">Register a new membership</p>

                            <ul>{msg.map((msg, index) => <li style={{ listStyle: "none", color: "red" }} key={index}>{msg}</li>)}</ul>
                            <form onSubmit={heandleRegister} method="post">
                                <div className="input-group mb-3">
                                    <input
                                        type="text"
                                        className={warning}
                                        name="name"
                                        id="name"
                                        placeholder="Your Name"
                                        value={name}
                                        onChange={(e) => setName(e.target.value)}
                                    />

                                    <div className="input-group-append">
                                        <div className="input-group-text">
                                            <span className="fas fa-user" />
                                        </div>
                                    </div>
                                </div>

                                <div className="input-group mb-3">
                                    <input
                                        type="email"
                                        value={email}
                                        onChange={(e) => setEmail(e.target.value)}
                                        name="email"
                                        className={warning}
                                        placeholder="Email"
                                    />
                                    <div className="input-group-append">
                                        <div className="input-group-text">
                                            <span className="fas fa-envelope" />
                                        </div>
                                    </div>
                                </div>
                                <div className="input-group mb-3">
                                    <input
                                        type="password"
                                        id="password"
                                        value={password}
                                        onChange={(e) => setPassword(e.target.value)}
                                        name="password"
                                        className={warning}
                                        placeholder="Password"
                                    />
                                    <div className="input-group-append">
                                        <div className="input-group-text">
                                            <span className="fas fa-lock" />
                                        </div>
                                    </div>
                                </div>
  
                                <div className="input-group mb-3">
                                    <input
                                        type="password"
                                        className={warning}
                                        name="confPassword"
                                        id="confPassword"
                                        placeholder="Repeat your password"
                                        
                                        onKeyUp={(e) => checkPassword(e.target.value)}
                                    />
                                    <div className="input-group-append">
                                        <div className="input-group-text">
                                            <span className="fas fa-lock" />
                                        </div>
                                    </div>
                                </div>

                                <div className="row ">
                                    {/* /.col */}
                                    <div className="col-4  ">
                                        <button type="submit" className="btn btn-primary btn-block">
                                            Register
                                        </button>
                                    </div>
                                    {/* /.col */}
                                </div>
                            </form>
                            <div className="social-auth-links text-center mb-3">
                                <p>- OR -</p>
                                <a href="#" className="btn btn-block btn-primary">
                                    <i className="fab fa-facebook mr-2" /> Sign in using Facebook
                                </a>
                                <a href="#" className="btn btn-block btn-danger">
                                    <i className="fab fa-google-plus mr-2" /> Sign in using
                                    Google+
                                </a>
                            </div>
                            {/* /.social-auth-links */}
                            <a href="/login" className="text-center">I already have a membership</a>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default Register;
