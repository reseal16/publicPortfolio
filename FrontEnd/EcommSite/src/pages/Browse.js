import React from 'react';
import {useState} from 'react';
import Navbar from '../components/Navbar';
import PageTitle from '../components/PageTitle';
//import BrowseItemButton from '../components/BrowseItemButton'; not needed
import ItemList from '../components/ItemList';
import ItemData from '../data/ItemData';


function Browse() {
    const [item, setItem] = useState(ItemData)

        return(
            <div>
                
                <Navbar />
                <div>
                    <PageTitle title="Browse" />
                </div>                
                <div id="browseItm">
                    <ItemList item={item}/>
                </div>
            </div>
            
        )
}

export default Browse;
