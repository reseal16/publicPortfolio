import React from 'react';
import CommentDetail from './CommentDetail';
import NewPost from './NewPost';
import PostDetail from './PostDetail';

class Timeline extends React.Component {


    
    render(){
        return(
            <div>
                <div>
                    <NewPost />
                </div>
                <div>
                    <PostDetail />
                </div>
            </div>




        );



    }



}

export default Timeline;