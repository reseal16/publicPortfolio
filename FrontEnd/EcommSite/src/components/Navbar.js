import React from 'react';
import { Link } from 'react-router-dom';
import logo from '../data/assets/logo.png';



function Navbar(){

        return(
            <div>
                <div>
                    <img src={logo} alt="logo" />
                </div>
                <div id="navbar">
                    <ul id="navbar">
                        <li className="navbar">
                            <Link to='/'>
                                <button id="navbar">
                                    Home
                                </button>
                            </Link>
                        </li>
                        <li className="navbar">
                            <Link to='/browse'>
                                <button id="navbar">
                                    Browse
                                </button>
                            </Link>
                        </li>
                        <li className="navbar">
                            <Link to='/classes'>
                                <button id="navbar">
                                    Classes
                                </button>
                            </Link>
                        </li>
                        <li className="navbar">
                            <Link to='/cart'>
                                <button id="navbar">
                                    Cart
                                </button>
                            </Link>
                        </li>
                    </ul>
                </div>
            </div>
        )

}


export default Navbar;