import React from 'react';
import Navbar from '../components/Navbar';
import CheckoutButton from '../components/CheckoutButton';
import PageTitle from '../components/PageTitle';
import ItemDetails from '../components/ItemDetails';
import rushone from '../data/assets/rushone.jpg';


function Cart(){

    return(
        <div>
            <Navbar />
            <PageTitle title="Cart" />
            <div>
                <img src={rushone} className="cart" alt="backpack" />
                "511 Rush 12 Backpack" "$80.00"
                <CheckoutButton />
            </div>

        </div>

    );

}

export default Cart;


 
//Requires checkout button component