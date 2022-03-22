import React from 'react'
import { Link } from 'react-router-dom';
import ItemDetails from './ItemDetails';


function ItemList({item}) {
    

    if(!item || item.length === 0){
        return <p>No items are currently available.</p>
    }
    return (
        <div>
            {item.map((item) => (
                    <Link to={`/product/${item.itNo}/${item.name}/`}>
                        <button className="browse">
                            <img alt="" className="browse" src={item.currentImg} /><br />
                            {item.name}<br />
                            {"$"+ item.price}<br />
                            {item.itNo}
                        </button>
                    </Link>
            ))}
        </div>
    )
}

export default ItemList;