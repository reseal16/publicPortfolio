import React from 'react';

class NewComment extends React.Component {
    state= {comment:''};
    onFormSubmit(event){
        event.preventDefault();

    }

    render() {
        return (
        <div className="comment">
            <form onSubmit={this.onFormSubmit} className="newComment">
                <div>
                    <label>
                        New Comment
                    </label>
                </div>
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

export default NewComment
