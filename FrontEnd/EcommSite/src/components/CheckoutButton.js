import React, { Component } from 'react'
import {Link} from 'react-router-dom';

function CheckoutButton() {

    return (
      <div>
        <Link to="/checkout">
            <button>
                Checkout
            </button>
        </Link>
      </div>
    )

}

export default CheckoutButton; 