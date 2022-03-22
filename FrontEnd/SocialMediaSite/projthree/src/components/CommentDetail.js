import React from 'react';
import UserProfile from './UserProfile';

class CommentDetail extends React.Component {

    render(){
        return(
            <div className="comment">
                <a href="/" className="Avatar">
                    <img alt="Avatar" />
                </a>
                <div className="content">
                    <a href="/" className="author">
                        asdf
                    </a>
                    <div className="metadata">
                        <span className="date">
                            asdf
                        </span>
                    </div>
                    <div className="text"></div>
                </div>
            </div>
        );
    }
}

export default CommentDetail;