import React from 'react';
import Navbar from '../components/Navbar';
import ItemDetails from '../components/ItemDetails';
import rushone from '../data/assets/rushone.jpg';

function Confirmation(){

    return(
        <div>
            <Navbar />
            <div id="confirm">
                Order Confirmed<br />
                <img src={rushone} className="cart" /><br />
                "511 Rush 12 Backpack" "$80.00"
            </div>
        </div>

    );

};


export default Confirmation; 