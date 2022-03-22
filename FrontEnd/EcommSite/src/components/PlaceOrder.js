import React, { Component } from 'react'
import { Link } from 'react-router-dom';

function PlaceOrder() {
  return (
    <div>
      <Link to='/confirmation'>
        <button id="placeorder">
            Place Order
        </button>
      </Link>
    </div>
  )
}

export default PlaceOrder
