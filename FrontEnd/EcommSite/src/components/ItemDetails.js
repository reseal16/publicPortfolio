import {useParams} from 'react-router-dom';
import PageTitle from './PageTitle';

function ItemDetails(props){

    return(
        <div>
            <img alt="" className="browse" src={props.img} /><br />
            {props.name}<br />
            ${props.price}<br />
            {props.itNo}

        </div>
    );
};

export default ItemDetails;