//this component is no longer used
import React from 'react';
import {Link} from 'react-router-dom';
import ItemList from './ItemList';

function BrowseItemButton({item}) {

    return (

      <div>
        <Link to={"/product/"+ item.itNo}>
            <button>

            </button>
        </Link>
      </div>

    )

  }

export default BrowseItemButton;

