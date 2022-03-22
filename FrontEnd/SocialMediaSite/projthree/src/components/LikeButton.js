import React, {useState} from 'react';

function LikeButton() {
    const [count,setCount] = useState(0)

    function like() {
        setCount(prevCount => prevCount + 1)
    }

    return (
        <div>
            <button >
                <i class="thumbs up outline icon" onClick={like}>
                 <label>{count}</label>
                </i>
            </button>
        </div>
        
        )

}

export default LikeButton;