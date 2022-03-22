import React, { Component } from 'react';
import {Link} from 'react-router-dom';


function AddCart(){

    return (
      <div>
        <Link to="/cart">
            <button>
                Add to Cart
            </button>
        </Link>
      </div>
    )

}

export default AddCart;
