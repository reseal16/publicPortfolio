import {useState} from 'react';
import { useParams } from 'react-router-dom';
import Navbar from '../components/Navbar';
import AddCart from '../components/AddCart';
//import ColorSelector from './ColorSelector'; Not set up
import PageTitle from '../components/PageTitle';
import ItemDetails from '../components/ItemDetails';
import Cart from './Cart';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import ItemData from '../data/ItemData';
import CheckoutButton from '../components/CheckoutButton';


function ProductPage() {
    const params=useParams()
    const [currentItm, setCurrentItm] = useState(ItemData)

    return(
        <div>
            <Navbar />
            <PageTitle title={params.name} />
            <div id="prodpage">
                {/*img*/}
                <h2>Item Number: {params.itNo}</h2>
            </div>
            <CheckoutButton />
        </div> 
    )

}

export default ProductPage;

// requires add to cart button component