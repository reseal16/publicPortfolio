import React from 'react';
import NavBar from './NavBar';
import NewComment from './NewComment';
import UserProfile from './UserProfile';
import CommentDetail from './CommentDetail';
import NewPost from './NewPost';
import Timeline from './Timeline';


const App = () => {

    return (
        <div className="ui container">
            <div className="navbar">
                <NavBar />
            </div>
            <div>
                <Timeline />
            </div>
        </div>

        
        );



};

export default App;