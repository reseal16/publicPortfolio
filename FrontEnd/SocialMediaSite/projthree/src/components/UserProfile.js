import React from 'react';
import NewPost from './NewPost';


class UserProfile extends React.Component{

    render(){
        return(
            <div id="container">
                <div id="profDetail">
                    <div id="profAva">
                        <img alt="Avatar" src="logo192.png" />
                    </div>
                    <div>
                        <div id="details">
                            <label><h2>Details</h2></label>
                        </div>
                        <div>
                            <ul class="details">
                                <li>
                                    Name:
                                </li>
                                <li>
                                    Age:
                                </li>
                                <li>
                                    Location:
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div>
                    <NewPost />
                </div>
            </div>

        );

    }

}






export default UserProfile;
