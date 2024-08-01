import React, { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function Login() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [msg, setMsg] = useState([]);
  const navigate = useNavigate();
  let [warning, setWarning] = useState("form-control");

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post("http://192.168.100.2:8081/v1/api/auth", {
        email: email,
        password: password,
      });
      let token = response.data.payload.token;
      let id = response.data.payload.id;
      let menuList = response.data.payload.roles.menuList;
      let name = response.data.payload.name

      localStorage.setItem("token", token);
      localStorage.setItem("id", id);
      localStorage.setItem("menuList", JSON.stringify(menuList));
      localStorage.setItem("name", name);
      navigate("/dashboard");
    } catch (error) {
      if (error.response) {
        setWarning("form-control is-invalid");
        setMsg(error.response.data.messages);
      }
    }
  };

  useEffect(() => {
    if (localStorage.getItem("token") && localStorage.getItem("id")) {
      navigate("/dashboard");
    }
  }, []);

  return (
    <div className="row align-items-center">
      <div className="col-md-4 offset-md-4">
        <div className=" justify-content-between">
          <div className="login-logo">
            <h3>Login</h3>
          </div>
          {/* /.login-logo */}
          <div className="card">
            <div className="card-body login-card-body">
              <p className="login-box-msg">Sign in to start your session</p>
              <ul>
                {msg.map((message, index) => (
                  <li style={{ listStyle: "none", color: "red" }} key={index}>{message}</li>
                ))}
              </ul>

              <form onSubmit={handleLogin} method="post">
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
                    className="form-control"
                    placeholder="Password"
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
                      Sign In
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
              <p className="mb-1">
                <a href="forgot-password.html">I forgot my password</a>
              </p>
              <p className="mb-0">
                <a href="/register" className="text-center">
                  Register a new membership
                </a>
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Login;
