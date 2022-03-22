import React from 'react';
import Home from '../pages/Home';
import Browse from '../pages/Browse';
import ProductPage from '../pages/ProductPage';
import Cart from '../pages/Cart';
import Checkout from '../pages/Checkout';
import Confirmation from '../pages/Confirmation';
import Classes from '../pages/Classes';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';


function App(){

    return(        
        <div>
            <Router>
                <Routes>
                    <Route path='/' element={<Home />} />
                    <Route path='/browse' element={<Browse />} />
                    <Route path='/cart' element={<Cart />} />
                    <Route path='/checkout' element={<Checkout />} />
                    <Route path='/confirmation' element={<Confirmation />} />
                    <Route path='/classes' element={<Classes />} />
                    <Route path='/product/:itNo/:name' element={<ProductPage />} />
                </Routes>
            </Router>
        </div>       
    );
};
export default App; 