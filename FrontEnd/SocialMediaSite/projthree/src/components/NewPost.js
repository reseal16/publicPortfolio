import React from 'react';

class NewPost extends React.Component {
    state= {comment:''};
    onFormSubmit(event){
        event.preventDefault();

    }

    render() {
        return (
        <div className="newPost">
            <form onSubmit={this.onFormSubmit} className="newPostForm">
                <div><label>New Post</label></div>
                <div className="field">
                    
                    <input type="text" />                    
                </div>
                <div>
                    <button>Submit</button>
                </div>
            </form>
        </div>
        
        );
        console.log(this.state.comment);
    }

}

export default NewPost;
