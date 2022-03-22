import React from 'react';
import UserProfile from './UserProfile';
import LikeButton from './LikeButton';


class PostDetail extends React.Component {
    constructor(props){
        super(props);
        this.state={
            items: [],
            isLoaded: false,
            
        }


    }
    componentDidMount(){
        fetch('https://dummyapi.io/data/v1/')
            .then(res => res.json())
            .then((json) => {
                this.setState({
                    isLoaded: true,
                    items: json.items
                });
            },
                (error) => {
                    this.setState({
                        isLoaded: true,
                        error

                    });

                }
            )

    }
    render () {
        const {isLoaded, items} = this.state;

        if (!isLoaded) {
            return<div>Loading...</div>
        }
        else {
        return(
            <div className="post-detail">
                Data!<LikeButton />
                
            </div>
        );

        }


    }


}


export default PostDetail;