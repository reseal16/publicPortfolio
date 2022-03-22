import React from 'react';
import Navbar from '../components/Navbar';
import PageTitle from '../components/PageTitle';
import PlaceOrder from '../components/PlaceOrder';
import rushone from '../data/assets/rushone.jpg';

function Checkout() {
  return (
    <div>
        <Navbar />
        <div>
            <PageTitle title="Checkout" />
        </div>
          <img src={rushone} alt="backpack" className="cart" /><br />
                "511 Rush 12 Backpack" "$80.00"<br />
                <br />
                <br />
        <div id="checkoutform">
          <form>
            <label>
              Name: 
            </label>
            <input type="text" /><br />
            <label>
              Address 1: 
            </label>
            <input type="text" /><br />
            <label>
              Address 2: 
            </label>
            <input type="text" /><br />
            <label>
              City: 
            </label>
            <input type="text" /><br />
            <label>
              State: 
            </label>
            <input type="text" /><br />
            <label>
              Zip Code: 
            </label>
            <input type="text" /><br />
            <label>
              Card Type: 
            </label>
            <input type="text" /><br />
            <label>
              Card Number: 
            </label>
            <input type="text" /><br />
            <label>
              Expiration: 
            </label>
            <input type="text" /><br />
            <label>
              CCV: 
            </label>
            <input type="text" /><br />
            
          </form>
        </div>
        <div>
            <PlaceOrder />

        </div>

    </div>

  );

};

export default Checkout;
