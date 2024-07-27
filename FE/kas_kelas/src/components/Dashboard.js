import React, { useState , useEffect} from 'react'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'
import Header from './Header'
import SideNav from './SideNav'
import Home from './Home'
import Footer from './Footer'

function Dashboard() {
const [users, setUsers] = useState([]);
const [error, setError] = useState('');
const navigate = useNavigate();

useEffect(() => {
    try {
        const token = localStorage.getItem("token");
        const id = localStorage.getItem("id");
        const response = axios.get(`http://192.168.100.2:8081/v1/api/users`, {
            headers: {
                'Authorization': `Bearer ${token}`
            }
        })
        .then(response => {
            setUsers(response.data);
        })
        .catch(error => {
            navigate("/");
            setError(error);
            console.log(error);
        })
        
    } catch (error) {
        console.log(error); 
    }

}, [])

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